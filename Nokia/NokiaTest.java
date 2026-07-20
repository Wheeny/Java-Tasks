
import java.util.Scanner;
public class NokiaTest{
	public static void main(String[]  args){
	Scanner inputCollector = new Scanner(System.in);


                 String menuFunctions = """
NOKIA MENU MAP
List of Menu Functions

Select Option

1. Phone book
2. Messages
3. Chat
4. Call Register
5. Tones
6. Settings
7. Call Divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. Sim Services
0.  Exit

 """;



String phoneBook = """

Select Option

1. Search
2. Service Nos.
3. Add Name
4. Erase
5. Edit
6. Assign Tone
7. Send b'card
8. Options
9. Speed Dials
10.Voice Tags
0. Main menu

""";

String optionsMenu = """

Select Option

1. Type of View
2. Memory Status
0. Back

""";	

String messagesMenu = """

Select Option

1.Write Messages
2. Inbox
3. Outbox
4. Picture Messages
5. Templates
6. Smileys
7. Message Settings
8. Info Service
9. Voice Mailbox Number
10. Service Command Editor
0.  Back

""";

String messageSettingsMenu = """

Select Option

1. Set 1
2. Common
0. Back



""";

String set1Menu = """

Select Option

1. Message Centre Number
2. Message Sent as
3. Message Validity
0. Back

""";

String commonMenu = """

Select Option

1. Delivery Reports
2. Reply via same centre
3. Character Support
0. Back

""";

String callRegisterMenu = """

Select Option

1. Missed Calls
2. Received Calls
3. Dialled Numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid Credit
0. Back

""";

String showCallDurationMenu =  """

Select Option

1. Last call duration
2. All calls' duration
3. Received calls duration
4. Dialled calls' duration
5. Clear timers
0. Back

""";

String showCallCostsMenu =  """

Select Option

1. Last call cost
2. All calls' costs
3. Clear counters
0. Back

""";
		
String callCostSettingsMenu =  """

Select Option

1. Call cost limits
2. Show costs in
0. Back

""";

String TonesMenu = """

Select Option

1. Ringing Tone
2. Ringing Volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
0. Back

""";

String 	SettingsMenu = """

Select Option

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
0. Back

""";

String 	callSettingsMenu = """

Select Option

1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic Answer
0. Back

""";

String 	phoneSettingsMenu = """

Select Option

1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm sim service actions
0. Back

""";

String 	securitySettingsMenu = """

Select Option

1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Phone security
6. Change access codes
0. Back

""";

String 	clockMenu = """

Select Option

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
0. Back

""";


int menuFunctionsList = 99;
int phoneBookList = 99;
int optionsList = 99;
int messagesList = 99;
int messageSettingList = 99;
int setList = 99;
int commonList = 99;
int callRegisterList = 99;
int showCallDurationList = 99;
int showCallCostsList = 99;
int callCostSettingsList = 99;
int tonesList = 99;
int settingsList = 99;
int callSettingsList = 99;
int phoneSettingsList = 99;
int securitySettingsList = 99;
int clockList = 99;


while(menuFunctionsList != 0){

	System.out.println(menuFunctions);

	menuFunctionsList = inputCollector.nextInt();

	switch(menuFunctionsList){

		case 1: System.out.println("Phone book"); 
		phoneBookList = 99;
		while(phoneBookList != 0){
			System.out.println(phoneBook);
			phoneBookList = inputCollector.nextInt();
 		
			switch(phoneBookList){
	
			case 1: System.out.println("Search"); break;
			case 2: System.out.println("Service Nos."); break;
			case 3: System.out.println("Add Name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign Tone"); break;
			case 7: System.out.println("Send b'card"); break;
			case 8: System.out.println("Options"); 													
				while (optionsList != 0){
					System.out.println(optionsMenu);
					optionsList = inputCollector.nextInt();

					switch(optionsList){

					case 1: System.out.println("Type of View"); break; 
					case 2: System.out.println("Memory Status"); break;
					default: System.out.println("Invalid Input");
				}
				}
				break;


			case 9: System.out.println("Speed Dials"); break;
			case 10: System.out.println("Voice Tags"); break;
			default: System.out.println("Invalid Input"); 
			}
			}	
			break;
			
		case 2: System.out.println("Messages"); 

			while(messagesList != 0){
				System.out.println(messagesMenu);
				messagesList = inputCollector.nextInt();

				switch(messagesList){
				case 1: System.out.println("Write Messages"); break;
				case 2: System.out.println("Inbox"); break;
				case 3: System.out.println("Outbox"); break;
				case 4: System.out.println("Picture Messages"); break;
				case 5: System.out.println("Templates"); break;
				case 6: System.out.println("Smileys"); break;
				case 7: System.out.println("Message Settings"); 

					while(messageSettingList != 0){
						System.out.println(messageSettingsMenu);
						messageSettingList = inputCollector.nextInt();

						switch(messageSettingList){

						case 1: System.out.println("Set 1"); 

							while(setList != 0){
								System.out.println(set1Menu);
								setList = inputCollector.nextInt();
                               
								switch(setList){
								case 1: System.out.println("Message Centre Number"); break; 
 								case 2: System.out.println("Message Sent as"); break;
 								case 3: System.out.println("Message Validity"); break;
								default: System.out.println("Invalid Input"); 
							}
							}
							break;


						case 2: System.out.println("Common"); 

							while(commonList!= 0){
								System.out.println(commonMenu);
								commonList = inputCollector.nextInt();

								switch(commonList){
								case 1: System.out.println("Delivery Reports"); break;
								case 2: System.out.println("Reply via same centre"); break;
								case 3: System.out.println("Character Support"); break;
								default: System.out.println("Invalid Input"); 
							}
							}
							break;
						default: System.out.println("Invalid Input");
					}
					}
					break;
				case 8: System.out.println("Info Service"); break;
				case 9: System.out.println("Voice Mailbox Number"); break;
				case 10:System.out.println("Service Command Editor"); break;
				default: System.out.println("Invalid Input");
			}
			}
     			break;
		case 3: System.out.println("Chat"); break;
		case 4: System.out.println("Call Register"); 

			while (callRegisterList != 0){
				System.out.println(callRegisterMenu);
				callRegisterList = inputCollector.nextInt();

				switch(callRegisterList){
				case 1: System.out.println("Missed Calls"); break;
				case 2: System.out.println("Received Calls"); break;
				case 3: System.out.println("Dialled Numbers"); break;
				case 4: System.out.println("Erase recent call lists"); break;
				case 5: System.out.println("Show call duration"); 

					while(showCallDurationList != 0){
						System.out.println(showCallDurationMenu);
						showCallDurationList = inputCollector.nextInt();

						switch(showCallDurationList){
						case 1: System.out.println("Last call duration"); break;
						case 2: System.out.println("All calls' duration"); break;
						case 3: System.out.println("Received calls duration"); break;
						case 4: System.out.println("Dialled calls duration"); break;
						case 5: System.out.println("Clear timers"); break; 
						default: System.out.println("Invalid Input");
					}
					}
					break;

				case 6: System.out.println(" Show call costs"); 

					while(showCallCostsList != 0){
						System.out.println(showCallCostsMenu);
						showCallCostsList = inputCollector.nextInt();

						switch(showCallCostsList){

						case 1: System.out.println("Last call cost"); break;
						case 2: System.out.println("All calls' cost"); break;
						case 3: System.out.println("Clear counters"); break;
						default: System.out.println("Invalid Input");
					}
					}
					break;

				case 7: System.out.println("Call cost settings"); 

					while(callCostSettingsList != 0){
						System.out.println(callCostSettingsMenu);
						callCostSettingsList = inputCollector.nextInt();

						switch(callCostSettingsList){

						case 1: System.out.println("Call cost limits"); break;
						case 2: System.out.println("Show costs in"); break;
						default: System.out.println("Invalid Input");
					}
					}
					break;


				case 8: System.out.println("Prepaid Credit"); break;
				default: System.out.println("Invalid Input"); 
				}
				}
				break;

		case 5: System.out.println("Tones"); 

			while(tonesList != 0){
				System.out.println(TonesMenu);
				tonesList = inputCollector.nextInt();

				switch(tonesList){

				case 1: System.out.println("Ringing Tone"); break;
				case 2: System.out.println("Ringing Volume"); break;
				case 3: System.out.println("Incoming call alert"); break;
				case 4: System.out.println("Composer"); break;
				case 5: System.out.println("Message alert tone"); break;
				case 6: System.out.println("Keypad tones"); break;
				case 7: System.out.println("Warning and game tones"); break; 
				case 8: System.out.println("Vibrating alert"); break;
				case 9: System.out.println("Screen saver"); break; 
				default: System.out.println("Invalid Input"); break; 
			}
			}
			break;

		case 6: System.out.println("Settings"); 

			while (settingsList != 0){
				System.out.println(SettingsMenu);
				settingsList = inputCollector.nextInt();

				switch(settingsList){
				case 1: System.out.println("Call settings"); 

					while(callSettingsList != 0){
						System.out.println(callSettingsMenu);
						callSettingsList = inputCollector.nextInt();

						switch(callSettingsList){

						case 1: System.out.println("Automatic redial"); break;
						case 2: System.out.println("Speed dialling"); break;
						case 3: System.out.println("Call waiting options"); break;
						case 4: System.out.println("Own number sending"); break;
						case 5: System.out.println("Phone line in use"); break;
						case 6: System.out.println("Automatic Answer"); break;
						default: System.out.println("Invalid Input"); 
					}
					}
					break;
	
				case 2: System.out.println("Phone settings"); 

					while(phoneSettingsList != 0){
				
						System.out.println(phoneSettingsMenu);
						phoneSettingsList = inputCollector.nextInt();

						switch(phoneSettingsList){

						case 1: System.out.println("Language"); break;
						case 2: System.out.println("Cell info display"); break;
						case 3: System.out.println("Welcome note"); break;
						case 4: System.out.println("Network selection"); break;
						case 5: System.out.println("Lights"); break;
						case 6: System.out.println("Confirm sim service actions"); break;
						default: System.out.println("Invalid Input"); 
					}
					}
					break;
		

				case 3: System.out.println("Security settings"); 

					while(securitySettingsList != 0){
						System.out.println(securitySettingsMenu);
						securitySettingsList = inputCollector.nextInt();

						switch(securitySettingsList){

						case 1: System.out.println("PIN code request"); break;
						case 2: System.out.println("Call barring service"); break;
						case 3: System.out.println("Fixed dialling"); break;
						case 4: System.out.println("Closed user group"); break;
						case 5: System.out.println("Phone security"); break;
						case 6: System.out.println("Change access codes"); break;
						default: System.out.println("Invalid Input"); 
					}
					}
					break;


				case 4: System.out.println("Restore factory settings"); break;
				default: System.out.println("Invalid Input"); break; 
				}
				}
				break;

		case 7: System.out.println("Call Divert");break;
		case 8: System.out.println("Games"); break;
		case 9: System.out.println("Calculator"); break;
		case 10: System.out.println("Reminders"); break;
		case 11: System.out.println("Clock"); 
		
			while (clockList != 0){
				System.out.println(clockMenu);
				clockList = inputCollector.nextInt();

				switch(clockList){

				case 1: System.out.println("Alarm clock"); break;
				case 2: System.out.println("Clock settings"); break;
				case 3: System.out.println("Date setting"); break;
				case 4: System.out.println("Stopwatch"); break;
				case 5: System.out.println("Countdown timer"); break;
				case 6: System.out.println("Auto update of date and time"); break;
				default: System.out.println("Invalid Input"); 
			}
			}
			break;

		case 12: System.out.println("Profiles"); break;
		case 13: System.out.println("Sim Services"); break;
		case 0: {
			System.out.println("*********** Goodbye ***********");
 			}; break;

		default: System.out.println("Invalid Input"); 


				}

			}


    		}

	}	