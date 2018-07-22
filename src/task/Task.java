package task;

import scheduler.Scheduler;

public class Task {
	private String name;
	private double deadline, consumo;
	private double instLiberacao, instTermino;
	private Scheduler scheduler;

	public Task(String name, double instLiberacao, double consumo, double deadline, Scheduler scheduler) {		
		this.name = name;
		this.consumo = consumo;		
		this.deadline = deadline;
		this.instLiberacao = instLiberacao;		
		this.instTermino = this.consumo + this.instLiberacao;
		this.scheduler = scheduler;
	}		

	public final String toString() {
        // TODO
        return "";
	}
	
	public void executeStep(){
		scheduler.executeStep();
	}

	public void addTask(Task task){
		scheduler.addTask(task);
	}

	public double getDeadline() {
		return deadline;
	}	

	public double getConsumo() {
		return consumo;
	}	

	public double getUtilizacao() {
		return consumo / deadline;
	}	

	public double getInstLiberacao() {
		return instLiberacao;
	}
		
	public double getInstTermino() {
		return instTermino;
	}

	public double getTempoResposta() {
		return instTermino - instLiberacao;
	}

	public String getName() {
		return name;
	}
	
	public void setInstTermino(double instTermino) {
		this.instTermino = instTermino;
	}

}
