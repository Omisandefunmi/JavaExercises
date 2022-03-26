package Chapter5;

import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                To access phone menu:\s
                press 1 for Phonebook\s
                press 2 for Messages
                press 3 for Chat
                press 4 for Phone Register
                press 5 for Tones
                press 6 for Settings
                press 7 for Call Divert
                press 8 for Games
                press 9 for Calculator
                press 10 for Reminder
                press 11 for Clock
                press 12 for Profiles
                press 13 for Sim Services""");
        System.out.print("Enter preferred option here: ");
        int menuList = scanner.nextInt();
        switch (menuList) {
            case 1 -> {
                System.out.println("Phonebook");
                System.out.println("Enter any number between 1 - 10 for more options");
                int phoneBookOptions = scanner.nextInt();
                switch (phoneBookOptions) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos.");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Options");
                        System.out.println("Enter either 1 or 2 for more options");
                        int moreOptions = scanner.nextInt();
                        switch (moreOptions) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                            default -> System.out.println("invalid entry");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            }
            case 2 -> {
                System.out.println("Messages");
                System.out.println("Enter 1 - 10");
                int messagesOption = scanner.nextInt();
                switch (messagesOption) {
                    case 1 -> System.out.println("Write message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture message");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Message Settings");
                        System.out.println("press 1 or 2 for more options");
                        int messageSettingsOption = scanner.nextInt();
                        switch (messageSettingsOption) {
                            case 1 -> {
                                System.out.println("Set 1");
                                System.out.println("press either 1, 2 or 3 for more options");
                                int setOneOptions = scanner.nextInt();
                                switch (setOneOptions) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                    default -> System.out.println("You have selected an invalid entry");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("press either 1, 2 or 3 for available options");
                                int commonOptions = scanner.nextInt();
                                switch (commonOptions) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                    default -> System.out.println("You have selected an invalid entry");
                                }
                            }
                            default -> System.out.println("invalid entry");
                        }
                    }
                    case 8 -> System.out.println("Info Service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                    default -> System.out.println("Incorrect entry");
                }
            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                System.out.println("Call Register");
                System.out.println("press numbers between 1 and 8 for more options ");
                int callRegisterOptions = scanner.nextInt();
                switch (callRegisterOptions) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.println("Enter numbers 1, 2, 3, 4 or 5 for more options");
                        int callDurationOptions = scanner.nextInt();
                        switch (callDurationOptions) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls duration");
                            case 5 -> System.out.println("Clear timers");
                            default -> System.out.println("This entry is invalid");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show call costs");
                        System.out.println("press 1, 2 or 3 for more options");
                        int callCostsOption = scanner.nextInt();
                        switch (callCostsOption) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls' cost");
                            case 3 -> System.out.println("Clear counters");
                            default -> System.out.println("Error!");
                        }
                    }
                    case 7 -> {
                        System.out.println("Call cost settings");
                        System.out.println("press 1 or 2 for more options");
                        int callCostSettingOption = scanner.nextInt();
                        switch (callCostSettingOption) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                            default -> System.out.println("Error!");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            case 5 -> {
                System.out.println("Tones");
                System.out.println("press numbers between 1 and 9 for more options");
                int tonesOption = scanner.nextInt();
                switch (tonesOption) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                    default -> System.out.println("Error");
                }
            }
            case 6 -> {
                System.out.println("Settings");
                System.out.println("press 1, 2, 3 or 4 for settings options");
                int settingsOptions = scanner.nextInt();
                switch (settingsOptions) {
                    case 1 -> {
                        System.out.println("Call settings");
                        System.out.println("press 1, 2, 3, 4, 5 or 6 for more options");
                        int callSettingsOptions = scanner.nextInt();
                        switch (callSettingsOptions) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialing");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                            default -> System.out.println("Error!");
                        }
                    }
                    case 2 ->{ System.out.println("Phone settings");
                                System.out.println("Enter 1, 2, 3, 4, 5 or 6 for more options");
                                int phoneSettingsOptions = scanner.nextInt();
                        switch (phoneSettingsOptions) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                            default -> System.out.println("Error");
                        }
                    }
                    case 3 -> {
                        System.out.println("Security settings");
                        System.out.println("for more options, press 1, 2, 3, 4, 5 or 6");
                        int securitySettingsOptions = scanner.nextInt();
                        switch (securitySettingsOptions){
                        case 1:
                        System.out.println("PIN code request");
                        break;
                        case 2:

                        }
                    }
                    case 4 -> System.out.println("Restore factory settings");
                    default -> System.out.println("Error!");
                }
            }
            case 7 -> System.out.println("Call Divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminder");
            case 11 -> System.out.println("Clock");
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("Sim Services");
            default -> System.out.println("invalid entry");


        }
    }
}
