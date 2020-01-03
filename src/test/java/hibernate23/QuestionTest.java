package hibernate23;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuestionTest {
	public static void main(String[] args) {
		
		SessionFactory sessFact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session sess =sessFact.openSession();
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Java is programming :::");
		list1.add("Java is a platform :::");
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("Servlet api :::");
		list2.add("Servlet is an interface :::");
		
		Question ques1 = new Question();
		ques1.setQname("What is java ??");
		ques1.setAnswer(list1);
		

		Question ques2 = new Question();
		ques2.setQname("What is java ??");
		ques2.setAnswer(list2);
		
		sess.beginTransaction();
		sess.persist(ques1);
		sess.persist(ques2);
		
		sess.getTransaction().commit();
		
		System.out.println("SUCCESS");
		
		
	}

}
