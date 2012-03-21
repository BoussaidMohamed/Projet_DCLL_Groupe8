
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
      //--------------------------------------------------
      Element question1 = new Element("question");
      racine.addContent(question1);
      Attribute type1 = new Attribute("type", "multichoice");
      question1.setAttribute(type1);
      Element name1 = new Element("name");
      Element text8 = new Element("text");
      text8.setText("Architecture a 3 niveaux ?");
      name1.addContent(text8);
      question1.addContent(name1);
      Element questiontext1 = new Element("questiontext");
      Attribute type5 = new Attribute("format", "moodle_auto_format");
      questiontext1.setAttribute(type5);
      Element text9 = new Element("text");
      text9.setText("Que désigne une architecture à 3 niveaux ?");
      questiontext1.addContent(text9);
      question1.addContent(questiontext1);
      Element generalfeedback1 = new Element("generalfeedback");
      question1.addContent(generalfeedback1);
      Element text10 = new Element("text");
      generalfeedback1.addContent(text10);
      Element defaultgrade1 = new Element("defaultgrade");
      defaultgrade1.setText("1");
      question1.addContent(defaultgrade1);
      Element penalty1 = new Element("penalty");
      penalty1.setText("0.1");
      question1.addContent(penalty1);
      Element hidden1 = new Element("hidden");
      hidden1.setText("0");
      question1.addContent(hidden1);
      Element shuffleanswers1 = new Element("shuffleanswers");
      hidden1.setText("1");
      question1.addContent(shuffleanswers1);
      Element single = new Element("single");
      hidden1.setText("true");
      question1.addContent(single);
      Element shuffleanswers2 = new Element("shuffleanswers");
      hidden1.setText("true");
      question1.addContent(shuffleanswers2);
      Element correctfeedback = new Element("correctfeedback");  
      question1.addContent(correctfeedback);
      Element text11 = new Element("text");  
      correctfeedback.addContent(text11);
      Element partiallycorrectfeedback = new Element("partiallycorrectfeedback");  
      question1.addContent(partiallycorrectfeedback);
      Element text12 = new Element("text");  
      partiallycorrectfeedback.addContent(text12);
      Element incorrectfeedback = new Element("incorrectfeedback");  
      question1.addContent(incorrectfeedback);
      Element text13 = new Element("text");  
      incorrectfeedback.addContent(text13);
      Element answernumbering = new Element("answernumbering");  
      question1.addContent(answernumbering);
      answernumbering.setText("none");
      Element answer3 = new Element("answer");  
      question1.addContent(answer3);
      Attribute type6 = new Attribute("fraction", "-100");
      answer3.setAttribute(type6);
      Element text14 = new Element("text");  
      text14.setText("Une architecture MVC");
      answer3.addContent(text14);
      Element feedback5 = new Element("feedback"); 
      answer3.addContent(feedback5);
      Element text15 = new Element("text");  
      text15.setText("Une application  non distribuée peut implémentée MVC.");
      feedback5.addContent(text15);
      
      Element answer4 = new Element("answer");  
      question1.addContent(answer4);
      Attribute type7 = new Attribute("fraction", "100");
      answer4.setAttribute(type7);
      Element text16 = new Element("text");  
      answer4.addContent(text16);
      text16.setText("Une architecture N tiers ou N vaut 3");
      
      
      
      
      
      
      affiche();
      enregistre("Exercice1.xml");
      //--------------------------------------------------
   }
   
   public static void main(String[] args) {
	   GenererFichierXML g = new GenererFichierXML();
	   g.genererFichierXML();
   }
}