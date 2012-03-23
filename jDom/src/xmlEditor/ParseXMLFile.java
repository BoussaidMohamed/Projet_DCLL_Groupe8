package xmlEditor;

import java.util.ArrayList;
/**.
*CLass ParseXMLFile
*@author Souissi
*/

public class ParseXMLFile {

/**.
*attribut Document
*@author Souissi
*/
private  org.jdom.Document document;
/**.
*attribut racine
*@author Souissi
*/
private Element racine;
/**.
*attribut ListQcm
*@author Souissi
*/
private List<Qcm> listQcm;
/**.
*attribut ListAnswer
*@author Souissi
*/
private List<Answer> ListAnswer;
/**.
*attribut int
*@author Souissi
*/
private int cmp = 0;
/**.
*constructeur ParseXMLFILE
*@author Souissi
*/

public ParseXMLFile() {
super();
// TODO Auto-generated constructor stub
}
/**.
*methode parse
*@author Souissi
*/
 public final void parse() {

SAXBuilder sxb = new SAXBuilder();
try {
// On crée un nouveau document JDOM avec en argument le fichier XML
// Le parsing est terminé ;)
document = sxb.build(new File("Exercice1.xml"));
} catch (Exception e) {
}
// On initialise un nouvel élément racine avec l'élément racine du
//document.
racine = document.getRootElement();
listQcm = new ArrayList<Qcm>();
// On crée une List contenant tous les noeuds "etudiant" de l'Element
// racine
@SuppressWarnings("rawtypes")
List listEtudiants = racine.getChildren("question");

// On crée un Iterator sur notre liste
@SuppressWarnings("rawtypes")
Iterator i = listEtudiants.iterator();

while (i.hasNext()) {
// On recrée l'Element courant à chaque tour de boucle afin de
// pouvoir utiliser les méthodes propres aux Element comme :
// selectionner un noeud fils, modifier du texte, etc.
Element courant = (Element) i.next();
// On affiche le nom de l'élément courant

String type = courant.getAttributeValue("type");
String name = courant.getChild("name").getChild("text").getText();
String questiontext = courant.getChild("questiontext").getChild("text").getText();
String questiontextFormat = courant.getChild("questiontext").getAttributeValue("format");
String image = courant.getChild("image").getText();
String generalfeedback = courant.getChild("generalfeedback").getChild("text").getText();
String defaultgrade = courant.getChild("defaultgrade").getText();
String penalty = courant.getChild("penalty").getText();
String hidden = courant.getChild("hidden").getText();
String shuffleansnwers = courant.getChild("shuffleansnwers").getText();


Qcm qcm = new Qcm();
qcm.setType(type);
qcm.setName(name);
qcm.setQuestiontext(questiontext);
qcm.setQuestiontextFormat(questiontextFormat);
qcm.setImage(image);
qcm.setGeneralfeedback(generalfeedback);
qcm.setDefaultgrade(defaultgrade);
qcm.setPenalty(penalty);
qcm.setHidden(hidden);
qcm.setShuffleansnwers(shuffleansnwers);

@SuppressWarnings("rawtypes")
List listEtudiants2 = courant.getChildren("answer");

@SuppressWarnings("rawtypes")
Iterator j = listEtudiants2.iterator();

ListAnswer = new ArrayList<Answer>();

int c = 0;
while (j.hasNext()) {
Element answer = (Element) j.next();
String text = answer.getChild("text").getText();
String feedback = answer.getChild("feedback").getChild("text").getText();
String answerFraction = answer.getAttributeValue("fraction");
Answer objet = new Answer();
objet.setText(text);
objet.setFeedback(feedback);
objet.setAnswerFraction(answerFraction);

ListAnswer.add(c, objet);
c++;
}

qcm.setAnswer(ListAnswer);

/**
* Remplissage de la liste ListQcm
*/
listQcm.add(cmp, qcm);
cmp++;
}
 }

}
