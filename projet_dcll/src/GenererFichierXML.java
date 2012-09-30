import java.io.*;
import org.jdom.*;
import org.jdom.output.*;

/**.
 * <b> GenererFichierXML repr�sente la classe
 * qui permet de g�n�rer un fichier xml selon le format
 * du moodle </b>
 * <p>
 * GenererFichierXML poss�de les attributs suivants :
 * <ul>
 * <li> l'�l�ment racine </li>
 * <li> le document dont le param�tre est la racine</li>
 * </ul>
 * </p>
 *@author GAUTIER ST�phanie
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
/**
 * Constructeur. Ici le constructeur n'est pas n�cessaire.
 */
public GenererFichierXML() {
}
/**
* Cette methode permet d'obtenir la racine
* d'un fichier xml.
* Retourne la racine d'un fichier xml.
* @return racine
*/
   public static Element getRacine() {
return racine;
}
/**.
* Cette m�thode permet de donner un �l�ment racine
* au futur fichier xml
* @param racine
* @see setRacine#getRacine
*/
public static void setRacine(final Element racine) {
GenererFichierXML.racine = racine;
}
/**
* Cette methode permet d'obtenir le document
* Retourne le document.
* @return document
*/
public static org.jdom.Document getDocument() {
return document;
}
/**.
* Cette methode permet de donner un document � partir
* de la classe GenererFichierXML
* @param document
* @see setDocument#getDocument
*/
public static void setDocument(final org.jdom.Document document) {
GenererFichierXML.document = document;
}
/**
* Ne prend rieb en param�tre.
* Cette m�thode permet d'afficher dans la console
* le fichier g�n�r�
* Ne retourne rien
*/
static void affiche() {
      try {
         //On utilise ici un affichage classique avec getPrettyFormat()
         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         sortie.output(document, System.out);
} catch (java.io.IOException e) { 
//exception Vide
      }
   }
/**.
* Cete m�thode permet d'enregistrer la g�n�ration dans
* la console dans un document.
* @param fichier
* @see enregistrer#getDocument
* @see enregitrer#setDocument
*/
static void enregistre(final String fichier) {
      try {
         //On utilise ici un affichage classique avec getPrettyFormat()
         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         //Remarquez qu'il suffit simplement de cr�er une instance,
         //de FileOutputStream
         //avec en argument le nom du fichier pour effectuer la s�rialisation.
         sortie.output(document, new FileOutputStream(fichier));
      } catch (java.io.IOException e) {
      	}
   }
	/**
	 * Cette m�thode permet de g�n�rer un fichier xml
	 * Dans cette m�thode, on cr�� le fichier.
	 * Cette m�thode ne retourne rien
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
   /**
    * <b>
    * le main principal
    * la g�n�ration du fichier xml
    * se fait ici.
    * Le fichier g�n�r� est Exercice1.xml
    * </b>
    * @param args
    */
   public static void main(String[] args) {
	   GenererFichierXML g = new GenererFichierXML();
	   g.genererFichierXML();
   }
}