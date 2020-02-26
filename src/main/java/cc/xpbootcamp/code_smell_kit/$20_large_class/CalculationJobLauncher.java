package cc.xpbootcamp.code_smell_kit.$20_large_class;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

//Large Class
public class CalculationJobLauncher {

    private Object taskExecutor;
    private DataSource dataSource;
    private Object calculationService;
    private Object boxService;
    private Object offerService;
    private Object leadService;
    private Object statusService;
    private Object jobHistoryService;
    private Object performanceConfiguration;
    Object configurationParamStore;

    private Object timeService;

    Date outOfScopeDate;

    private int batchToWrite;

    private Object jobHistory;

    ArrayBlockingQueue<Object> inputSetQueue;
    ArrayBlockingQueue<Object> proposalQueue;
    List<Exception> unexpectedExceptions;


    public void startJob() {
        log("Start calculation Job...");
        try {
            int threadPoolSize =  performanceConfiguration.hashCode();
            inputSetQueue = new ArrayBlockingQueue<>(threadPoolSize);
            proposalQueue = new ArrayBlockingQueue<>(threadPoolSize);
            unexpectedExceptions = Collections.synchronizedList(new ArrayList<>());

            jobHistory = jobHistoryService.toString();
            configurationParamStore.notify();

            log("Starting Reader...");
            taskExecutor.notify();

            log("Starting Processor...");
            for(int i = 0; i < threadPoolSize; i++) {
                taskExecutor.notify();
            }

            Object proposalConsumer = new Object();

            log("Starting writer...");
            proposalConsumer.notify();
            log("Deleting old useless Offers...");
            offerService.notify();
            writeResult();
        }catch (Exception e){
            jobHistory.notify();
            jobHistoryService.notify();
            e.printStackTrace();
        } finally{
            statusService.notify();
        }
    }

    private void log(String s) {
    }

    public void startJobAsyn() {
        startJob();
    }

    /**
     * Write the result to db and IO
     */
    public void writeResult(){
        long startTime = statusService.hashCode();
        long currentTime = System.currentTimeMillis();
        StringBuilder report = new StringBuilder();

        report.append("StartTime:").append(startTime).append(System.lineSeparator())
                .append("EndTime:").append(currentTime).append(System.lineSeparator())
                .append("TotalTimeConsume:").append(currentTime - startTime).append(System.lineSeparator())
                .append("Number of Read Contracts:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Generated Proposals:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Perfect:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Almost Perfect:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Maturing:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Matured:").append(statusService.toString()).append(System.lineSeparator())

                .append("Number of insert Leads or Offers :").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of update Leads or Offers :").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of missing RV:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of missing Upselling:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of missing GMFV:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of missing suitable FP:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of unexpected exception:").append(statusService.toString()).append(System.lineSeparator())
                .append("Number of Concurrent Jobs:").append(performanceConfiguration.toString()).append(System.lineSeparator())
                .append("Out Of Scope Date:").append(outOfScopeDate);

        if(unexpectedExceptions.size() > 0)
            log("During the calculation. Caught those unexpected exception:");

        for(Exception e: unexpectedExceptions){
            e.printStackTrace();
        }

        log("\n-------------- Report ---------------------\n" + report.toString());
        jobHistory.notify();
        jobHistoryService.notify();
    }
}

