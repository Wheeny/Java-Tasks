import java.util.Scanner;
public class NokiaForward{
	public static void main(String[]  args){
	Scanner inputCollector = new Scanner(System.in);

		String menuFunctions = """
            NOKIA MENU MAP
List of Menu Functions

1. Phone book
2. Messages
3. Chat
4. Tones
5. Settings
6. Phone Settings
7. Call Divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. Sim Services

 """;
		System.out.println(menuFunctions);
		int menuFunctions = inputCollector.nextInt();

		}

	}

