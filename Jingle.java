import java.time.Duration;
/**
 * Write a description of class Jingle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jingle extends AudioTracks
{
    
    private String company;
    private String product;
    /**
     * Constructor for objects of class Jingle
     */
    public Jingle(String title, long minutes, long seconds, String product, String company)
    {
       this.title = title;
       this.minutes = minutes;
       this.seconds = seconds;
       this.product = product;
       this.company = company;
      
    }
    
    public String getCompany(){
        return company;
    }
    
    public String getProduct(){
        return product;
    }
    
//         public void setProduct(String product){
//         this.product = product;
//     }
//     
//           public void setCompany(String company){
//         this.company = company;
//     }
//     
    


}
