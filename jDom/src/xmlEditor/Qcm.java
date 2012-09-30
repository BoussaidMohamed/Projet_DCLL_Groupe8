package xmlEditor;

import java.util.ArrayList;
import java.util.List;
/**.
*CLass ParseXMLFile
*@author Souissi
*/
public class Qcm {

/**.
*attribut type
*@author Souissi
*/
private String type;
/**.
*attribut Name
*@author Souissi
*/
private String name;
/**.
*attribut questiontext
*@author Souissi
*/
private String questiontext;
/**.
*attribut questiontextFormat
*@author Souissi
*/
private String questiontextFormat;
/**.
*attribut image
*@author Souissi
*/
private String image;
/**.
*attribut generalfeedback
*@author Souissi
*/
private String generalfeedback;
/**.
*attribut defaultgarde
*@author Souissi
*/
private String defaultgrade;
/**.
*attribut penalty
*@author Souissi
*/
private String penalty;
/**.
*attribut hidden
*@author Souissi
*/
private String hidden;
/**.
*attribut shuffleanswers
*@author Souissi
*/
private String shuffleansnwers;
/**.
*attribut Answer
*@author Souissi
*/
private List<Answer> answer;
/**.
*QCM()
*@author Souissi
*/
public Qcm() {
super();
// TODO Auto-generated constructor stub
}
/**.
*Cette methode possède les parametres suivants :
 * @param type , name, questiontext, questiontextFormat, image, generalfeedback,
 *@author Souissi
 */

public Qcm(final String type, final String name, final String questiontext,
final String questiontextFormat, final String image, final String generalfeedback,
final String defaultgrade, final String penalty, final String hidden,
final String shuffleansnwers, final List<Answer> answer) {
super();
this.type = type;
this.name = name;
this.questiontext = questiontext;
this.questiontextFormat = questiontextFormat;
this.image = image;
this.generalfeedback = generalfeedback;
this.defaultgrade = defaultgrade;
this.penalty = penalty;
this.hidden = hidden;
this.shuffleansnwers = shuffleansnwers;
this.answer = answer;
}
/**.
 * Methode GetQestionTextFormat
 * @return questiontextFormat
 */
private String getQuestiontextFormat() {
return questiontextFormat;
}
/**.
 * Methode setQuestiontextFormat
 * @param questiontextFormat
 */
public final void setQuestiontextFormat(final String questiontextFormat) {
this.questiontextFormat = questiontextFormat;
}

/**.
* Methode getType
* @return type
*/
public final String getType() {
return type;
}


/**.
 * Methode setType
 * @attrib type
 * @param type
 */
public final void setType(final String type) {
this.type = type;
}
/**.
 * Methode getAnswer
* @return answer
 */
public final List<Answer> getAnswer() {
return answer;
}
/**.
 * Methode setAnswer
* @param answer
 */

public final void setAnswer(final List<Answer> answer) {
this.answer = answer;
}
/**.
 * Methode getName
* @return name
 */
public final String getName() {
return name;
}
/**.
 * Methode setAnswer
* @param name
 */
public final void setName(final String name) {
this.name = name;
}
/**.
 * Methode getQuestionText
* @return questiontext
 */
public final String getQuestiontext() {
return questiontext;
}
/**.
 * Methode setQuestiontext
* @param Questiontext
 */
public final void setQuestiontext(final String questiontext) {
this.questiontext = questiontext;
}
/**.
 * Methode getimage
* @return image
 */
public final String getImage() {
return image;
}
/**.
 * Methode setimage
* @param image
 */
public final void setImage(final String image) {
this.image = image;
}
/**.
 * Methode getGeneralfeedback
* @return Generalfeedback
 */
public final String getGeneralfeedback() {
return generalfeedback;
}
/**.
 * Methode setGeneralfeedback
* @param Generalfeedback
 */
public final void setGeneralfeedback(final String generalfeedback) {
this.generalfeedback = generalfeedback;
}
/**.
 * Methode getDefaultgrade
* @return Defaultgrade
 */

public final String getDefaultgrade() {
return defaultgrade;
}
/**.
 * Methode setDefaultgrade
* @param Defaultgrade
 */
public final void setDefaultgrade(final String defaultgrade) {
this.defaultgrade = defaultgrade;
}
/**.
 * Methode getpenalty
* @return penalty
 */
public final String getPenalty() {
return penalty;
}
/**.
 * Methode setpenalty
* @param penalty
 */
public final void setPenalty(final String penalty) {
this.penalty = penalty;
}
/**.
 * Methode getHidden
* @return Hidden
 */
public final String getHidden() {
return hidden;
}
/**.
 * Methode setHidden
* @param Hidden
 */
public final void setHidden(final String hidden) {
this.hidden = hidden;
}
/**.
 * Methode getShuffleansnwers
* @return Shuffleansnwers
 */
public final String getShuffleansnwers() {
return shuffleansnwers;
}
/**.
 * Methode setShuffleansnwers
* @param Shuffleansnwers
 */
public final void setShuffleansnwers(final String shuffleansnwers) {
this.shuffleansnwers = shuffleansnwers;
}
}
