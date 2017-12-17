package droidaudio.apollo.edus.com.droidaudio.record.audio;

import com.edus.apollo.common.biz.task.Priority;
import com.edus.apollo.common.biz.task.Task;
import com.edus.apollo.common.biz.task.TaskFactory;

import java.io.File;

/**
 * Created by panda on 2017/12/17.
 */

public class RecordUtils {
    private static final String GROUP_NAME = "MediaRecordWrapper";
    private static final int CONCURRENT_COUNT = 1;

    public static Task getSingleRecordTask(){
        Task task = TaskFactory.getInstance().getTask(GROUP_NAME, Priority.IMMEDIATE);
        task.setConcurrentCount(1);
        return task;
    }

}
