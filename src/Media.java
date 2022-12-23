
public class Media {
	String MediaID, MediaTitle, MediaType;
	int MediaStock, MediaPrice, TotalPrice, NovelPage, MovieRate;
	public Media(String mediaID, String mediaTitle, String mediaType, int mediaStock, int mediaPrice, int totalPrice,
			int novelPage, int movieRate) {
		super();
		MediaID = mediaID;
		MediaTitle = mediaTitle;
		MediaType = mediaType;
		MediaStock = mediaStock;
		MediaPrice = mediaPrice;
		TotalPrice = totalPrice;
		NovelPage = novelPage;
		MovieRate = movieRate;
	}
	public String getMediaID() {
		return MediaID;
	}
	public void setMediaID(String mediaID) {
		MediaID = mediaID;
	}
	public String getMediaTitle() {
		return MediaTitle;
	}
	public void setMediaTitle(String mediaTitle) {
		MediaTitle = mediaTitle;
	}
	public String getMediaType() {
		return MediaType;
	}
	public void setMediaType(String mediaType) {
		MediaType = mediaType;
	}
	public int getMediaStock() {
		return MediaStock;
	}
	public void setMediaStock(int mediaStock) {
		MediaStock = mediaStock;
	}
	public int getMediaPrice() {
		return MediaPrice;
	}
	public void setMediaPrice(int mediaPrice) {
		MediaPrice = mediaPrice;
	}
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
	public int getNovelPage() {
		return NovelPage;
	}
	public void setNovelPage(int novelPage) {
		NovelPage = novelPage;
	}
	public int getMovieRate() {
		return MovieRate;
	}
	public void setMovieRate(int movieRate) {
		MovieRate = movieRate;
	}
	

}
