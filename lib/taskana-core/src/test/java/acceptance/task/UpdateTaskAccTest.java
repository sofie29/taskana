package acceptance.task;

import java.sql.SQLException;

import org.h2.store.fs.FileUtils;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import acceptance.AbstractAccTest;
import pro.taskana.TaskService;
import pro.taskana.exceptions.ClassificationNotFoundException;
import pro.taskana.exceptions.InvalidArgumentException;
import pro.taskana.exceptions.InvalidWorkbasketException;
import pro.taskana.exceptions.NotAuthorizedException;
import pro.taskana.exceptions.TaskAlreadyExistException;
import pro.taskana.exceptions.WorkbasketNotFoundException;
import pro.taskana.security.JAASRunner;
import pro.taskana.security.WithAccessId;

/**
 * Acceptance test for all "update task" scenarios.
 */
@RunWith(JAASRunner.class)
public class UpdateTaskAccTest extends AbstractAccTest {

    public UpdateTaskAccTest() {
        super();
    }

    @Ignore
    @WithAccessId(
        userName = "user_1_1",
        groupNames = { "group_1" })
    @Test
    public void testUpdatePrimaryObjectReferenceOfTask()
        throws SQLException, NotAuthorizedException, InvalidArgumentException, ClassificationNotFoundException,
        WorkbasketNotFoundException, TaskAlreadyExistException, InvalidWorkbasketException {

        // TaskService taskService = taskanaEngine.getTaskService();
        // Task task = taskService.getTask("TKI:000000000000000000000000000000000000");
        // task.setPrimaryObjRef(createObjectReference("COMPANY_A", "SYSTEM_A", "INSTANCE_A", "VNR", "7654321"));
        // Task updatedTask = taskService.updateTask(task);
        //
        // assertNotNull(updatedTask);
        // assertEquals("7654321", updatedTask.getPrimaryObjRef().getValue());
        // assertNotNull(updatedTask.getCreated());
        // assertNotNull(updatedTask.getModified());
        // assertNotEquals(updatedTask.getCreated(), updatedTask.getModified());
        // assertEquals(task.getCreated(), updatedTask.getCreated());
        // assertEquals(task.isRead(), updatedTask.isRead());
    }

    @Ignore
    @WithAccessId(
        userName = "user_1_1",
        groupNames = { "group_1" })
    @Test
    public void testThrowsExceptionIfMandatoryPrimaryObjectReferenceIsNotSetOrIncomplete()
        throws SQLException, NotAuthorizedException, InvalidArgumentException, ClassificationNotFoundException,
        WorkbasketNotFoundException, TaskAlreadyExistException, InvalidWorkbasketException {

        // TaskService taskService = taskanaEngine.getTaskService();
        // Task task = taskService.getTask("TKI:000000000000000000000000000000000000");
        // task.setPrimaryObjRef(null);
        // Task updatedTask = taskService.updateTask(task);
        //
        // // Exception
        //
        // newTask.setPrimaryObjRef(createObjectReference("COMPANY_A", "SYSTEM_A", "INSTANCE_A", "VNR", null));
        //
        // createdTask = taskService.createTask(newTask);
        //
        // // Exception
        //
        // newTask.setPrimaryObjRef(createObjectReference("COMPANY_A", "SYSTEM_A", "INSTANCE_A", null, "1234567"));
        //
        // createdTask = taskService.createTask(newTask);
        //
        // // Exception
        //
        // newTask.setPrimaryObjRef(createObjectReference("COMPANY_A", "SYSTEM_A", null, "VNR", "1234567"));
        //
        // createdTask = taskService.createTask(newTask);
        //
        // // Exception
        //
        // newTask.setPrimaryObjRef(createObjectReference("COMPANY_A", null, "INSTANCE_A", "VNR", "1234567"));
        //
        // createdTask = taskService.createTask(newTask);
        //
        // // Exception
        //
        // newTask.setPrimaryObjRef(createObjectReference(null, "SYSTEM_A", "INSTANCE_A", "VNR", "1234567"));
        //
        // createdTask = taskService.createTask(newTask);
        //
        // // Exception
        //
    }

    @Ignore
    @WithAccessId(
        userName = "user_1_1",
        groupNames = { "group_1" })
    @Test
    public void testUpdateClassificationOfTask()
        throws SQLException, NotAuthorizedException, InvalidArgumentException, ClassificationNotFoundException,
        WorkbasketNotFoundException, TaskAlreadyExistException, InvalidWorkbasketException {

        // TaskService taskService = taskanaEngine.getTaskService();
        // Task with classification T2000
        // Task task = taskService.getTask("TKI:000000000000000000000000000000000000");
        // task.setClassificationKey("T2100"));
        // Task updatedTask = taskService.updateTask(task);
        //
        // assertNotNull(updatedTask);
        // assertEquals("T2100", updatedTask.getClassification().getKey());
        // assertNotEquals(updatedTask.getCreated(), updatedTask.getModified());
        // assertEquals(22, updatedTask.getPriority());
        // assertEquals(task.getPlanned(), updatedTask.getPlanned());
        // assertEquals(???, updatedTask.getDue()); // should be one day later
        // assertEquals("T-Vertragstermin VERA", updatedTask.getName());
        // assertEquals("T-Vertragstermin VERA", updatedTask.getDescription());
    }

    @Ignore
    @WithAccessId(
        userName = "user_1_1",
        groupNames = { "group_1" })
    @Test
    public void testCustomPropertiesOfTask()
        throws SQLException, NotAuthorizedException, InvalidArgumentException, ClassificationNotFoundException,
        WorkbasketNotFoundException, TaskAlreadyExistException, InvalidWorkbasketException {

        // TaskService taskService = taskanaEngine.getTaskService();
        // Task with classification T2000
        // Task task = taskService.getTask("TKI:000000000000000000000000000000000000");
        // task.setCustomProperty1("T2100"));
        // ...
        // Task updatedTask = taskService.updateTask(task);
        //
        // assertNotNull(updatedTask);
        // meaningful assertions
    }

    @Ignore
    @WithAccessId(
        userName = "user_1_1",
        groupNames = { "group_1" })
    // @Test(expected = InvalidOperationException.class)
    public void testUpdateOfWorkbasketKeyNotAllowed()
        throws SQLException, NotAuthorizedException, InvalidArgumentException, ClassificationNotFoundException,
        WorkbasketNotFoundException, TaskAlreadyExistException, InvalidWorkbasketException {

        TaskService taskService = taskanaEngine.getTaskService();
        // Task task = taskService.getTask("TKI:000000000000000000000000000000000000");
        // task.setWorkbasketKey("USER_2_2");
        // Task updatedTask = taskService.updateTask(task);
    }

    @AfterClass
    public static void cleanUpClass() {
        FileUtils.deleteRecursive("~/data", true);
    }
}
