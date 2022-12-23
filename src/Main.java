import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Media> List_Media = new ArrayList<>();
	
	void MainMenu() {
		System.out.println("Media Shop");
		System.out.println("==========");
		System.out.println("1. View Media");
		System.out.println("2. Add Media");
		System.out.println("3. Delete Media");
		System.out.println("4. Exit");
		System.out.println("Choose >> ");
		
	}
	
	void ViewMedia(ArrayList<Media> List_Media) {
		
		if(List_Media.isEmpty()) {
			System.out.println("Media list is still empty...");
			System.out.println("Press enter to continue");
			scan.nextLine();
		}else {
			System.out.println("===========================================");
			System.out.printf("| %8s | %15s | %10s | %10s | %5s | %10s | \n", "Media ID", "Title", "Page Count", "Movie Rating", "Stock", "Final Price");
			for(Media x : List_Media) {
				System.out.printf("| %8s | %15s | %10d | %10d | %5d | %10d | \n", x.getMediaID(), x.getMediaTitle(), x.getNovelPage(), x.getMovieRate(), x.getMediaStock(), x.getTotalPrice());
			}
		}
	}
	
	void InsertMedia(ArrayList<Media> List_Media) {
		String MediaID, MediaTitle, MediaType;
		int MediaStock, MediaPrice, TotalPrice = 0, NovelPage = 0, MovieRate = 0;
		Random rand = new Random();
		
		do {
			System.out.println("Input title [5 - 20 characters] : ");
			MediaTitle = scan.nextLine();
		}while(MediaTitle.length() < 5 || MediaTitle.length() > 20);
		do {
			System.out.println("Input stock [ < 0 ] : ");
			MediaStock = scan.nextInt();
		}while(MediaStock < 0);
		do {
			System.out.println("Input initial price [ < 1000 ] :");
			MediaPrice = scan.nextInt();scan.nextLine();
		}while(MediaPrice < 1000);
		do {
			System.out.println("Input media type [Novel | Movie] : ");
			MediaType = scan.nextLine();
		}while(!MediaType.equals("Novel") && !MediaType.equals("Movie") && !MediaType.equals("novel") && !MediaType.equals("movie"));
		if(MediaType.equals("Novel")) {
			do {
				System.out.println("Input how many page [150 - 800] : ");
				NovelPage = scan.nextInt();
			}while(NovelPage < 150 || NovelPage > 800);
		}else if(MediaType.equals("novel")) {
			do {
				System.out.println("Input how many page [150 - 800] : ");
				NovelPage = scan.nextInt();
			}while(NovelPage < 150 || NovelPage > 800);
		}else if(MediaType.equals("Movie")) {
			do {
				System.out.println("Input movie rating [1 - 100] : ");
				MovieRate = scan.nextInt();
			}while(MovieRate < 1 || MovieRate > 100);
		}else if (MediaType.equals("movie")) {
			do {
				System.out.println("Input movie rating [1 - 100] : ");
				MovieRate = scan.nextInt();
			}while(MovieRate < 1 || MovieRate > 100);
		}
		
		MediaID = "MD" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		if(MediaType.equals("Novel")) {
			TotalPrice = MediaPrice + (MediaPrice*(NovelPage/400));
		}else if(MediaType.equals("novel")){
			TotalPrice = MediaPrice + (MediaPrice*(NovelPage/400));
		}else if(MediaType.equals("Movie")) {
			TotalPrice = MediaPrice + (MediaPrice*(MovieRate/100));
		}else if(MediaType.equals("movie")) {
			TotalPrice = MediaPrice + (MediaPrice*(MovieRate/100));
		}
		
		Media ItemMedia = new Media(MediaID, MediaTitle, MediaType, MediaStock, MediaPrice, TotalPrice, NovelPage, MovieRate);
		List_Media.add(ItemMedia);
	}
	
	void DeleteMedia(ArrayList<Media> List_Media) {
		String Delete;
		int Check = 0;
		if(List_Media.isEmpty()) {
			System.out.println("Media list is still empty");
		}else {
			ViewMedia(List_Media);
			System.out.println("Input ID that you want to delete : ");
			Delete = scan.nextLine();
				for(int i = 0 ; i < List_Media.size() ; i++) {
					if(List_Media.get(i).getMediaID().equals(Delete)){
						List_Media.remove(i);
						Check = 1;
					}
				}
				if(Check == 0) {
					System.out.println("Wrong ID");
				}else {
					System.out.println("Delete Success");
				}
		}
	}
	
	public Main() {
		int menu;
		do {
			MainMenu();
			menu = scan.nextInt();scan.nextLine();
			switch (menu) {
			case 1:
				ViewMedia(List_Media);
				break;
			case 2:
				InsertMedia(List_Media);
				break;
			case 3:
				DeleteMedia(List_Media);
				break;
			default:
				System.out.println("Input must be between 1 to 4");
				break;
			}
		}while(menu != 4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
