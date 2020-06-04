import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 
import java.util.Arrays; 
public class Solution3 {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br= new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null||!st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
    public static void main(String args[])
    {   FastReader fs= new FastReader();
        Movie moviearr[]=new Movie[5];
        for (int i=0;i<moviearr.length;i++)
        {
            moviearr[i]=new Movie(fs.next(), fs.next(), fs.next(), fs.nextInt());
        }
        String searchGenre= fs.next();

        Movie result[]=getMovieByGenre(moviearr,searchGenre);
        for(int i=0;i<result.length;i++)
        {
            if(result[i].getbudget()>80000000)
            System.out.println(" High Budget Movie ");
            else
            System.out.println(" Low Budget Movie ");
        }
    }

    public static Movie[] getMovieByGenre(Movie[] moviearr, String searchGenre) {
        Movie newres[]=new Movie[0];
        for(int i=0;i<moviearr.length;i++)
        {
            if(moviearr[i].getgenre().equalsIgnoreCase(searchGenre))
            {
                newres=Arrays.copyOf(newres, newres.length+1);
                newres[newres.length-1]=moviearr[i];
            }
        }
        return newres;
    }
    
}
class Movie
{
    String movieName;
    String company;
    String genre;
    int budget;
    public String getmovieName()
    {
        return movieName;
    }
    public String getCompany()
    {
        return company;
    }
    public String getgenre()
    {
        return genre;
    }
    public int getbudget()
    {
        return budget;
    }
    public void setmovieName(String movieName)
    {
        this.movieName=movieName;
    }
    public void setcompany(String company)
    {
        this.company=company;
    }
    public void setgenre(String genre)
    {
        this.genre=genre;
    }
    public void setbudget(int budget)
    {
        this.budget=budget;
    }
public Movie(String movieName, String company, String genre, int budget)
{
    this.movieName=movieName;
    this.company=company;
    this.genre=genre;
    this.budget=budget;
}
}