import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class YearShould {

    @ParameterizedTest
    //Given
    @CsvSource({"401,false", "100,false", "8343,false", "1000,false"})
    void when_isLeapYear_given_year_not_divisible_by_400_return_false(Integer yearToCheck, boolean expectedValue) {

        Year year = new Year(yearToCheck);

        //When
        boolean isLeapYear = year.isLeapYear();

        //Then
        assertThat(isLeapYear).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    //Given
    @CsvSource({"7,false" , "6,false", "45,false", "53,false"})
    void when_isLeapYear_given_year_not_divisible_by_4_return_false(Integer yearToCheck, boolean expectedValue){

        Year year = new Year(yearToCheck);

        //When
        boolean isLeapYear = year.isLeapYear();

        //Then
        assertThat(isLeapYear).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    //Given
    @CsvSource({"100,false" , "800,true", "1200,true", "1300,false"})
    void when_isLeapYear_given_year_divisible_by_100_but_not_by_400_return_false(Integer yearToCheck, boolean expectedValue){

        Year year = new Year(yearToCheck);

        //When
        boolean isLeapYear = year.isLeapYear();

        //Then
        assertThat(isLeapYear).isEqualTo(expectedValue);
    }

}
