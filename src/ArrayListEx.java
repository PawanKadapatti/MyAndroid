import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
	
		ArrayList<person> objPerson = new ArrayList<person>();
		
		for(int i =0 ; i < 10 ; i ++)
		{
			person p = new person();
			p.pName = " name " + i;
			p.pSurname = " surname " + i;
			p.pPhNo ="ph No "+ i;
			p.pAddr = " Addr " + i;
			objPerson.add(p);
		}
		for(int i =0 ; i < 10 ; i ++)
		{
			System.out.println(objPerson.get(i).pName + " " + objPerson.get(i).pPhNo);
		}
		System.out.println("Existing");
		System.out.println("Existing 12");
		System.out.println("sachin");
		
	}
}
