package xmlEditor;
/**.
*CLass Main
*@author Souissi
*/
public class Main {
/**.
*methode Main
*@param args
*@author Souissi
*/
static void main(final String[] args) {
            ParseXMLFile parce = new ParseXMLFile();
            parce.parse();
System.out.println(parce.listQcm.get(0).getQuestiontextFormat());
            System.out.println("#################");
 for (int i = 0; i < 1; i++) {
System.out.println(parce.listQcm.get(i).getAnswer().get(0).getText());
System.out.println(parce.listQcm.get(i).getAnswer().get(0).getAnswerFraction());
}

}
}
