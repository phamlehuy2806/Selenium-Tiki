package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;


public class TikiPage {
    WebDriver driver;

    By inputsearch = By.cssSelector("FormSearch__Input-sc-1fwg3wo-2");

    By inputbuttonsearch = By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3");


    public TikiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputsearch(String strInputText){
        driver.findElement(inputsearch).sendKeys(strInputText);
    }
    public void setInputbuttonsearch(){
        driver.findElement(inputbuttonsearch).click();
    }

    public void writeInput(String strInputText){
        this.setInputsearch(strInputText);

        this.setInputbuttonsearch();

    }

    public List<Product> getDiscountProductList(int productQty, int discount) {
        List<Product> fillteredItemList = Collections.unmodifiableList(new List<Product>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Product> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Product product) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Product> c) {
                return false;
            }

            public boolean addAll(int index, Collection<? extends Product> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }

            public Product get(int index) {
                return null;
            }

            public Product set(int index, Product element) {
                return null;
            }

            public void add(int index, Product element) {

            }

            public Product remove(int index) {
                return null;
            }

            public int indexOf(Object o) {
                return 0;
            }

            public int lastIndexOf(Object o) {
                return 0;
            }

            public ListIterator<Product> listIterator() {
                return null;
            }

            public ListIterator<Product> listIterator(int index) {
                return null;
            }

            public List<Product> subList(int fromIndex, int toIndex) {
                return null;
            }
        });
        return fillteredItemList;
    }

}
