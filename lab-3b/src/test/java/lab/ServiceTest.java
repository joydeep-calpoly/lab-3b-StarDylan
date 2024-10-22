package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

class ServiceTest {

    @Test
    void getDatabaseId() {
        Database database = mock(Database.class);
        when(database.getUniqueId()).thenReturn(152);

        Service service = new Service(database);

        assertEquals("Using database with id: 152", service.getDatabaseID());

    }

}