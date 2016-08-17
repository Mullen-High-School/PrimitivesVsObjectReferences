
public class PrimitivesVsObjectReferences
	{

		public static void main(String[] args)
			{
				//int firstVariable = 7;
				//int secondVariable = 7;
				
				String firstVariable = new String ("Mullen");
				String secondVariable = new String ("Mullen");
				
				if (firstVariable == secondVariable)
					{
						System.out.println("They match");
					}
				else
					{
						System.out.println("They do not match");
					}

			}

	}
