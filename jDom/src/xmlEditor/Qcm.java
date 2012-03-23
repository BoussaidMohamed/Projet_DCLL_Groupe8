package xmlEditor;

import java.util.ArrayList;
import java.util.List;

public class Qcm {
	
	
	public String type;
	public String name;
	public String questiontext;
	public String questiontextFormat;
	public String image;
	public String generalfeedback;
	public String defaultgrade;
	public String penalty;
	public String hidden;
	public String shuffleansnwers;
	public List<Answer> answer;
	
	
	
	public Qcm() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Qcm(String type, String name, String questiontext,
			String questiontextFormat, String image, String generalfeedback,
			String defaultgrade, String penalty, String hidden,
			String shuffleansnwers, List<Answer> answer) {
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



	public String getQuestiontextFormat() {
		return questiontextFormat;
	}



	public void setQuestiontextFormat(String questiontextFormat) {
		this.questiontextFormat = questiontextFormat;
	}



	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<Answer> getAnswer() {
		return answer;
	}


	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGeneralfeedback() {
		return generalfeedback;
	}
	public void setGeneralfeedback(String generalfeedback) {
		this.generalfeedback = generalfeedback;
	}
	public String getDefaultgrade() {
		return defaultgrade;
	}
	public void setDefaultgrade(String defaultgrade) {
		this.defaultgrade = defaultgrade;
	}
	public String getPenalty() {
		return penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public String getHidden() {
		return hidden;
	}
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	public String getShuffleansnwers() {
		return shuffleansnwers;
	}
	public void setShuffleansnwers(String shuffleansnwers) {
		this.shuffleansnwers = shuffleansnwers;
	}
}
