import org.junit.Assert;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DatabaseTest {
    private static final Integer[] INITIAL_ELEMENTS = new Integer[]{1, 2, 3};

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithLessThanOneElement() throws OperationNotSupportedException {
        Database db = new Database();


    }

    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowExceptionWithMoreThanSixteenElements() throws OperationNotSupportedException {
        Database db = new Database(new Integer[17]);


    }

    @Test
    public void constructingDatabaseShouldIncreaseElementsCount() throws OperationNotSupportedException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class dbClass = Database.class;
        Constructor constructor = dbClass.getDeclaredConstructor(Integer[].class);
        Database db = (Database) constructor.newInstance((Object) INITIAL_ELEMENTS);
        Field elementsCountField = dbClass.getDeclaredField("elementsCount");
        elementsCountField.setAccessible(true);
        //   elementsCountField.setInt(db,10);
        int fieldCurrentValue = elementsCountField.getInt(db);

        Assert.assertEquals(DatabaseTest.INITIAL_ELEMENTS.length, fieldCurrentValue);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void addingNullElementShouldThrowException() throws OperationNotSupportedException {
        Database db = new Database(INITIAL_ELEMENTS);
        db.add(null);
    }

    @Test
    public void addElementShouldIncreaseElementsCount() {
        Assert.fail("Just fail...");
    }
}
