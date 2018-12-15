import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class WCAControllerTest {
    WCAController controller;


    @Test
    public void moviesClassCanBeMocked(){
        //arrange
        Movies movies;
        //act
        movies=mock(Movies.class);
        //assert
        Assert.assertTrue(movies instanceof Movies);

    }


    @Test
    public void CanMocksAccessMoviesData(){
        //arrange
        Movies movies=mock(Movies.class);
        when(movies.getid()).thenReturn(1);
        //act
        int id=movies.getid();
        //arrange
        verify(movies,times(1)).getid();
        Assert.assertEquals(1,id);

    }

    @Test
    public void CanMocksChangeMoviesData(){
        //arrange
        Movies movies=mock(Movies.class);
        //act
        movies.setid(2);
        //arrange
        verify(movies,times(1)).setid(2);

    }

    @Test
    public void shouldBeAbleToAddMoviesClass(){
        //arrange
        Movies movies=mock(Movies.class);
        WCAController wcaController=mock(WCAController.class);
        when(wcaController.getmovies()).thenReturn(movies);
        //act
        wcaController.insertmovies(movies);
        Movies getmovies=wcaController.getmovies();
        //assert
        verify(wcaController,times(1)).insertmovies(movies);
        Assert.assertEquals(movies,getmovies);

    }

    @Test
    public void shouldBeAbleToAddBookClassTest(){
        //arrange
        Books books=mock(Books.class);
        WCAController wcaController=mock(WCAController.class);
        when(wcaController.getbooks()).thenReturn(books);
        //act
        wcaController.insertbooks(books);
        Books getbooks=wcaController.getbooks();
        //assert
        verify(wcaController,times(1)).insertbooks(books);

        Assert.assertEquals(books,getbooks);

    }
    @Test
    public void shouldBeAbleToAddMusicClassTest(){
        //arrange
        Music music=mock(Music.class);
        WCAController wcaController=mock(WCAController.class);
//        when(wcaController.getmusics()).thenReturn(music);
        //act
        wcaController.insertmusic(music);
        Music getmusic=wcaController.getmusics();
        //assert
//        verify(wcaController).insertmusics(music);

        Assert.assertEquals(music,getmusic);

    }

}
