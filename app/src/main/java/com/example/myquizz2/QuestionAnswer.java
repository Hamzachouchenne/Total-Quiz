package com.example.myquizz2;

public class QuestionAnswer {
    public static String questionForMusic[] ={
            "Which band did Freddie Mercury belong to? " ,
            "In which movie was 'See You Again' by Wiz Khalifa and Charlie Puth streamed?" ,
            "In what year was 'Despacito' streamed?" ,
            "Who is the leader of BTS?" ,
            "Who is the artist that sings the song 'Mockingbird'?" ,
            "Who performed at the NFL Super Bowl in 2023?" ,
            "In what song this verse is 'I'm an educated fool with money on my mind , Got my ten in my hand and a gleam in my eye" ,
            "Which from the following songs are not a Weeknd song" ,
            "What was the first hit song of Billie Eilish?" ,
            "Who is the top artist in Tunisia on spotify in 2022",
            "Who is the best android developer"
    };

    public static String choicesForMusic[][] = {
            {"ACDC" , "Queen" , "Imagine Dragons" , "Pink Floyd"} ,
            {"Superman" , "Fast and Furious Tokyo Drift" , "Fate of the Furious" , "Furious 7"} ,
            {"2015" , "2020" , "2017" , "2016"} ,
            {"V" , "RM" , "J-Hope" , "Jin"} ,
            {"Eminem" , "2-Pac" , "Juice World" , "Logic"} ,
            {"Dua Lipa" , "Adele" , "Maitre Gims" , "Rihanna"} ,
            {"all eyes on me" , "Panda" , "Gangsta's paradise" , "Ya lili Ya lila" },
            {"Die For You" , "Nothing is Lost" , "Blinding Lights" , "Under The Influence"} ,
            {"Ocean Eyes" , "Bad Guy" , "Happier than ever" , "Lovely"} ,
            {"Samara" , "A.L.A" , "Balti" , "ktyb"} ,
            {"hamza chouchenne" , "hamza chouchenne" , "hamza chouchenne" , "hamza chouchenne"}
    };

    public static String correctAnswersForMusic[] = {
            "Queen" ,
            "Furious 7" ,
            "2017" ,
            "RM" ,
            "Eminem" ,
            "Rihanna" ,
            "Gangsta's paradise" ,
            "Under The Influence" ,
            "Ocean Eyes",
            "A.L.A",
            "hamza chouchenne"
    };

    public static String questionForSport[] = {
            "Who won the FIFA World Cup Qatar 2022?" ,
            "Who is the all-time leading scorer in NBA history?" ,
            "Which country will host the summer olympics 2024" ,
            "Which football club has the most europian champions leagues?" ,
            "Which country hosted the FIFA word cup 2018?" ,
            "Who holds the record for the most goals scored in a single FIFA World Cup tournament?" ,
            "Who won the NBA championship in 2021?" ,
            "Who has the most NBA MVP?" ,
            "Who won the women's singles title at the US Open in 2022?" ,
            "Who is the current UFC (Ultimate Fighting Championship) heavyweight champion?"
    };

    public static String choicesForSports[][] = {
            {"brasil" , "france" , "tunisia" , "argentina"} ,
            {"LeBron James" , "Stephen Curry" , "James Harden" , "Michael Jordan"} ,
            {"england" , "chilie" , "france" , "japan"} ,
            {"real madrid" , "milan" , "barcelona" , "liverpool"} ,
            {"spain" , "north africa" , "russia" , "turkey"} ,
            {"messi" , "ronaldo" , "just fontaine" , "cristiano ronaldo"} ,
            {"Milwaukee Bucks" , "Golden State Warriors" , "Lakers" , "Memphis Grizzlies"} ,
            {"Michael Jordan" , "Bill Russell" , "Kareem Abdul-Jabbar" , "Wilt Chamberlain"} ,
            {"Iga Świątek" , "ons jabeur" , "Caroline Garcia" , "Aryna Sabalenka"} ,
            {"Jon Jones" , "Jamahal Hill" , "Israel Adesanya" , "Leon Edwards"}
    };

    public static String correctAnswerForSport[] = {
            "argentina" ,
            "LeBron James" ,
            "france" ,
            "real madrid" ,
            "russia" ,
            "just fontaine" ,
            "Milwaukee Bucks" ,
            "Kareem Abdul-Jabbar" ,
            "Iga Świątek" ,
            "Jon Jones"
    };

    public static String questionForMovies[] = {
            "What is the highest grossing movie of all the time?" ,
            "What film features Dwayne 'The Rock' Johnson and Kevin Hart together?" ,
            "What film features Will Smith and his son Jaden Smith?" ,
            "Which of these films is not Leonardo DiCaprio's?" ,
            "Which of these films is based on a video game?" ,
            "Which of the following films is not a musical film?" ,
            "which of the following films is a DC film?" ,
            "In what movie neymar.jr was present?" ,
            "What actor always want to do his stunts by himself?" ,
            "Which of these films are a horror film?"
    };

    public static String choicesForMovies[][] = {
            {"avatar" , "titanic" , "avengers endgame" , "aasfour estah"} ,
            {"central inteligence" , "bad boys" , "school night" , "pain & gain"} ,
            {"the karate kid" , "jumanji" , "after earth" , "i legend"} ,
            {"inception" , "titanic" , "the revenent" , "mr. & mrs. smith"} ,
            {"ready player one" , "uncharted" , "spider-man" , "batman"} ,
            {"lala land" , "the greatest showman" , "A star is born" , "peter rabbit"} ,
            {"captain america" , "iron man" , "wonder women" , "avengers"} ,
            {"xXx return of xander cage" , "fast and furious" , "zombie land" , "it"} ,
            {"tom halland" , "tom cruise" , "jhonny depp" , "andrew tate"} ,
            {"annabelle creation" , "ocean's 8" , "300" , "game night"}
    };

    public static String correctAnswerForMovies[] = {
            "avengers endgame" ,
            "central inteligence" ,
            "after earth" ,
            "mr. & mrs. smith" ,
            "uncharted" ,
            "peter rabbit" ,
            "wonder women" ,
            "xXx return of xander cage" ,
            "tom cruise" ,
            "annabelle creation"
    };
    public static String correct[] = {
            "Nice!!" ,
            "Good!!" ,
            "Correct!!" ,
            "Brilliant!!" ,
            "True!!"
    };
    public static String incorrect[] = {
            "better luck next time" ,
            "Unlucky" ,
            "Oops" ,
            "Sorry" ,
            "Incorrect"
    };
    static int[] imageArray = {
            R.drawable.starbucks,
            R.drawable.apple ,
            R.drawable.hyundai ,
            R.drawable.lv ,
            R.drawable.cisco ,
            R.drawable.mcdonals ,
            R.drawable.formulaone ,
            R.drawable.gta5 ,
            R.drawable.playstation ,
            R.drawable.windows
    };
    public static String correctAnswerForLogo [] = {
            "starbucks" ,
            "apple" ,
            "hyundai" ,
            "louis vuitton" ,
            "cisco" ,
            "mcdonald's" ,
            "formula one" ,
            "gta 5" ,
            "playstation" ,
            "windows"
    };
}
