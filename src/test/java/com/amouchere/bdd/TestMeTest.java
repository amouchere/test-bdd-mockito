package com.amouchere.bdd;

import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMeTest {

    @Mock
    private MockMe mock;

    @InjectMocks
    private TestMe underTest;

    @Test
    public void testAddFive_classic() {
        // GIVEN
        when(mock.makeAnOperation(anyInt(), anyInt())).thenReturn(5);

        // WHEN
        underTest.addFive(1);

        // THEN
        verify(mock, times(1)).makeAnOperation(1, 5);
    }

    @Test
    public void testAddFive_BDD() {
        // GIVEN
        given(mock.makeAnOperation(anyInt(), anyInt())).willReturn(5);

        // WHEN
        underTest.addFive(1);

        // THEN
        then(mock).should(atMost(1)).makeAnOperation(1, 5);
    }

}
