//interface InterviewQuestions{
//	
//}
//
//class AlgorithmInterviewQuestions implements InterviewQuestions{
//	public void executeAlgo() {
//		System.out.println("Algorithm related questions");
//	}
//}
//
//class AIInterviewQuestions implements InterviewQuestions{
//
//	public void executeAI() {
//		System.out.println("AI related questions");
//	}
//}
//
//class FinanceInterviewQuestions implements InterviewQuestions{
//	public void executeFinance() {
//		System.out.println("Finance related questions");
//	}
//}
//
////Drawback of this implementation is that if more classes are added 
////the conditionals increment
//class InterviewQuestionProcessor{
//	public static void process(InterviewQuestions question) {
//		if (question instanceof AlgorithmInterviewQuestions) {
//			AlgorithmInterviewQuestions algo = (AlgorithmInterviewQuestions) question;
//			algo.executeAlgo();
//		}
//		
//		else if (question instanceof AIInterviewQuestions) {
//			AIInterviewQuestions ai = (AIInterviewQuestions) question;
//			ai.executeAI();
//		}
//		
//		else if (question instanceof FinanceInterviewQuestions) {
//			FinanceInterviewQuestions fin = (FinanceInterviewQuestions) question;
//			fin.executeFinance();
//		}
//	}
//}
//
//public class OpenClosedProblem {
//	public static void main(String args[]) {
//		InterviewQuestionProcessor.process(new AlgorithmInterviewQuestions());
//	}
//}
