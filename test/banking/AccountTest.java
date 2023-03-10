package banking;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(Theories.class)
public class AccountTest {

    private Account sut;

    @Before
    public void setUp() {
        sut = new Account();
    }

    @Test
    public void shouldCreateANewAccount() {
        assertNotNull(sut);

    }

}