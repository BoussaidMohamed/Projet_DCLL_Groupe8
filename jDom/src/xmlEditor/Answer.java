package xmlEditor;

public class Answer {

public String text;
public String feedback;
public String answerFraction;
public Answer(String text, String feedback, String answerFraction) {
super();
		this.text = text;
		this.feedback = feedback;
		this.answerFraction = answerFraction;
	}
public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
public String getAnswerFraction() {
		return answerFraction;
	}
public void setAnswerFraction(String answerFraction) {
		this.answerFraction = answerFraction;
	}
public String getText() {
		return text;
	}
public void setText(String text) {
		this.text = text;
	}
public String getFeedback() {
		return feedback;
	}
public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
