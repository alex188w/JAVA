public class Cat {
    // Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.
int monthBirth;
int yearBirth;
String nameCat;
CatOwner catOwner;
char catMale;

public Cat(String nameCat, CatOwner catOwner) {
    this.nameCat = nameCat;
    this.catOwner = catOwner;
}

public int getMonthBirth() {
    return monthBirth;
}

@Override
public String toString() {
    return "Cat{" +
            "nameCat='" + nameCat + '\'' +
            ", catOwner=" + catOwner +
            ", catMale=" + catMale +
            '}';
}

public void setMonthBirth(int monthBirth) {
    this.monthBirth = monthBirth;
}

public int getYearBirth() {
    return yearBirth;
}

public void setYearBirth(int yearBirth) {
    this.yearBirth = yearBirth;
}

public String getNameCat() {
    return nameCat;
}

public void setNameCat(String nameCat) {
    this.nameCat = nameCat;
}

public CatOwner getCatOwner() {
    return catOwner;
}

public void setCatOwner(CatOwner catOwner) {
    this.catOwner = catOwner;
}

public char getCatMale() {
    return catMale;
}

public void setCatMale(char catMale) {
    this.catMale = catMale;
}

public boolean isMail() {
    return this.catMale == 'M';
}

public boolean equals(Object someCatObj) { // переобпределяем метод equals
    Cat someCat = (Cat) someCatObj;// перевели как обджект наш тип Cat
    return (this.catOwner.name.equals(someCat.catOwner.name)) &&
            (this.catMale == someCat.catMale) &&
            (this.nameCat.equals(someCat.nameCat)) &&
            (this.monthBirth == someCat.monthBirth) &&
            (this.yearBirth == someCat.yearBirth);
}
public int hashCode() { // переопределение хэш-кода
    return (monthBirth + yearBirth) * 27;
}
}
