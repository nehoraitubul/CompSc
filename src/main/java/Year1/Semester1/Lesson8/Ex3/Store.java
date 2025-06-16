package Year1.Semester1.Lesson8.Ex3;

public class Store {
    Delivery[] deliveryArray;
    CityDelivery[] cityArray;

    public String mostExpensiveDeliveryCity() {
        int biggestDistance = 0;
        CityDelivery city = cityArray[0];
        for (int i = 0; i < cityArray.length; i++) {
            if (cityArray[i].distance > biggestDistance) {
                biggestDistance = cityArray[i].distance;
                city = cityArray[i];
            }
        }
        return city.cityName;
    }

    public char[] clientNamesWithTheMostExpensiveDelivery(int price) {
        char[] firstNamePlusLastName = new char[0];
        for (int i = 0; i < cityArray.length; i++) {
            CityDelivery currCity = cityArray[i];
            String cityName = currCity.cityName;
            int counter = 0;
            for (int j = 0; j < deliveryArray.length; j++) {
                if (deliveryArray[j].getCityName().equals(cityName)) {
                    counter++;
                }
            }
            for (int j = 0; j < deliveryArray.length; j++) {
                if (deliveryArray[j].getCityName().equals(cityName)) {
                    if ((deliveryArray[j].price + ((currCity.distance) * 4.5) / counter) > price) {
                        firstNamePlusLastName = raiseStringArrayByOne(firstNamePlusLastName);
                        firstNamePlusLastName[firstNamePlusLastName.length-1] = deliveryArray[j].name.charAt(0);
                    }
                }
            }
        }
        return firstNamePlusLastName;
    }

    static char[] raiseStringArrayByOne(char[] arr){
        char[] newArr = new char[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
