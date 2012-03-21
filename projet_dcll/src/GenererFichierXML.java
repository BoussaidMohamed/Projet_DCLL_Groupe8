
import java.io.*;
import org.jdom.*;
import org.jdom.output.*;
/**
 *@author GAUTIER STéphanie
 *This class permits to generate a xml file.
 */
public class GenererFichierXML {
	/**
	 * element racine.
	 */
	private static Element racine = new Element("quiz");
	/**
	 * document.
	 */
	private static org.jdom.Document document = new Document(racine);
	
	public GenererFichierXML() {	
	}
	/**
	 * @return racine
	 */
   public static Element getRacine() {
		return racine;
	}

   /**
    * @param racine
    * @see setRacine#racine
    */
	public static void setRacine(final Element racine) {
		GenererFichierXML.racine = racine;
	}

	/**
	 * @return document
	 */
	public static org.jdom.Document getDocument() {
		return document;
	}

	/**
	 * @param document
	 * @see serDocument#document
	 */
	public static void setDocument(final org.jdom.Document document) {
		GenererFichierXML.document = document;
	}


	/**
	 */
	static void affiche() {
      try {
         //On utilise ici un affichage classique avec getPrettyFormat()
         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         sortie.output(document, System.out);
      } catch (java.io.IOException e) {
      	}
   }

	/**
	 * @param fichier
	 */
	static void enregistre(final String fichier) {
      try {
         //On utilise ici un affichage classique avec getPrettyFormat()
         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         //Remarquez qu'il suffit simplement de créer une instance,
         //de FileOutputStream
         //avec en argument le nom du fichier pour effectuer la sérialisation.
         sortie.output(document, new FileOutputStream(fichier));
      } catch (java.io.IOException e) {
      	}
   }

	/**
	 * @param args.
	 */
   public final void genererFichierXML() {
	   String phrase = "Tomcat est un conteneur implementant";
	   phrase += "toutes les specifications JEE";
      Element question = new Element("question");
      racine.addContent(question);
      Attribute type = new Attribute("type", "truefalse");
      question.setAttribute(type);
      Element name = new Element("name");
      question.addContent(name);
      Element text1 = new Element("text");
      text1.setText("Tomcat et JEE");
      name.addContent(text1);
      Element questiontext = new Element("questiontext");
      Attribute type2 = new Attribute("format", "moodle_auto_format");
      questiontext.setAttribute(type2);
      question.addContent(questiontext);
      Element text3 = new Element("text");
      text3.setText(phrase);
      questiontext.addContent(text3);
      Element image = new Element("image");
      question.addContent(image);
      Element generalfeedback = new Element("generalfeedback");
      question.addContent(generalfeedback);
      Element text2 = new Element("text");
      generalfeedback.addContent(text2);
      Element defaultgrade = new Element("defaultgrade");
      defaultgrade.setText("1");
      question.addContent(defaultgrade);
      Element penalty = new Element("penalty");
      penalty.setText("1");
      question.addContent(penalty);
      Element hidden = new Element("hidden");
      hidden.setText("0");
      question.addContent(hidden);
      Element shuffleansnwers = new Element("shuffleansnwers");
      shuffleansnwers.setText("0");
      question.addContent(shuffleansnwers);
      Element answer1 = new Element("answer");
      Attribute type3 = new Attribute("fraction", "0");
      answer1.setAttribute(type3);
      question.addContent(answer1);
      Element text4 = new Element("text");
      text4.setText("true");
      answer1.addContent(text4);
      Element feedback = new Element("feedback");
      answer1.addContent(feedback);
      Element text5 = new Element("text");
      text5.setText("Tomcat est un conteneur Web uniquement");
      feedback.addContent(text5);
      Element answer2 = new Element("answer");
      Attribute type4 = new Attribute("fraction", "100");
      answer2.setAttribute(type4);
      question.addContent(answer2);
      Element text6 = new Element("text");
      text6.setText("false");
      answer2.addContent(text6);
      Element feedback2 = new Element("feedback");
      answer2.addContent(feedback2);
      Element text7 = new Element("text");
      text7.setText("Tomcat est un conteneur Web uniquement");
      feedback2.addContent(text7);
      affiche();
      enregistre("Exercice1.xml");
   }
   
   public static void main(String[] args) {
	   GenererFichierXML g = new GenererFichierXML();
	   g.genererFichierXML();
   }
}