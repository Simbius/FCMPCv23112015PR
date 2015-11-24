package caf.war.crearMarcoLogicoTasks.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Task Client bean for 'Aprobar Marco del Proyecto V2' task.
 */
@ManagedBean(name = "AprobarMarcodelProyectoV2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class AprobarMarcodelProyectoV2 extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 5879190787469430784L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "9D70B072-BDD3-DE37-E0FD-8EAE70BDDD64";

	/**
	 * Default constructor
	 */
	public AprobarMarcodelProyectoV2() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 7858757174768151552L;
		
		public static String[][] FIELD_NAMES = new String[][] {{"publicaMarcoV1", "publicaMarcoV1"},
		};

		private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_publicaMarcoV1 publicaMarcoV1 = null;

		public static final String[] INPUTS = new String[] {"publicaMarcoV1", };

		public static final String[] OUTPUTS = new String[] {"publicaMarcoV1", };

		public TaskData() {
		}

		public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_publicaMarcoV1 getPublicaMarcoV1()  {
			if (publicaMarcoV1 == null) {
				publicaMarcoV1 = new caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_publicaMarcoV1();
			}
			return publicaMarcoV1;
		}

		public void setPublicaMarcoV1(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_publicaMarcoV1 publicaMarcoV1)  {
			this.publicaMarcoV1 = publicaMarcoV1;
		}
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}