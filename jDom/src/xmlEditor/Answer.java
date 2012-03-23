package xmlEditor;
/**.
 * <b> Answer repr�sente la classe
 * qui ou on stock la structure de deux exemple
 * du moodle </b>
 * <p>
 * Answer poss�de les attributs suivants :
 * <ul>
 * <li> l'�l�ment text </li>
 * <li> l'�l�ment feedback </li>
 * <li> l'�l�ment answerFraction </li>
 * </ul>
 * </p>
 *@author Souissi
 */
public class Answer {
/**.
*Text
*@author Souissi
*/
private String text;
/**.
*feedback
*@author Souissi
*/
private String feedback;
/**.
answerFraction
*@author Souissi
*/
private String answerFraction;
/**.
*Cette methode poss�de les parametres suivants :
 * @param text , feedback,answerFraction
 *@author Souissi
 */
public Answer(final String text, final String feedback, final String answerFraction) {
super();
this.text = text;
this.feedback = feedback;
this.answerFraction = answerFraction;
}
/**.
*Methode Answer
 *@author Souissi
 */
public Answer() {
super();
// TODO Auto-generated constructor stub
}
/**.
*Methode getAnswerFraction()
*@return answerFraction
 *@author Souissi
 */
public final String getAnswerFraction() {
return answerFraction;
}
/**.
*Methode setAnswerFraction)
*@param answerFraction
 *@author Souissi
 */
public final void setAnswerFraction(final String answerFraction){
this.answerFraction = answerFraction;
}
/**.
*Methode getText()
*@return text
 *@author Souissi
 */
public final String getText() {
return text;
}
/**.
*Methode setText()
*@param text
 *@author Souissi
 */
public final void setText(final String text){
this.text = text;
}
/**.
*Methode getFeedback()
*@return feedback
 *@author Souissi
 */
public final String getFeedback() {
return feedback;
}
/**.
*Methode getFeedback()
*@param feedback
 *@author Souissi
 */
public final void setFeedback(final String feedback) {
this.feedback = feedback;
}
}
