interface InterviewQuestions{
	void execute();
}

class AlgorithmInterviewQuestions implements InterviewQuestions{
	
	@Override
	public void execute() {
		System.out.println("Algorithm related questions");
	}
}

class AIInterviewQuestions implements InterviewQuestions{

	@Override
	public void execute() {
		System.out.println("AI related questions");
	}
}

class FinanceInterviewQuestions implements InterviewQuestions{
	
	@Override
	public void execute() {
		System.out.println("Finance related questions");
	}
}


class InterviewQuestionProcessor{
	public static void process(InterviewQuestions question) {
		question.execute();
	}
}
public class OpenClosedSolution {
	public static void main(String args[]) {
		InterviewQuestionProcessor.process(new AlgorithmInterviewQuestions());
	}
}
