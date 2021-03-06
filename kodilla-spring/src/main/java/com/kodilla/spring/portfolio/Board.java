package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (toDoList != null ? !toDoList.equals(board.toDoList) : board.toDoList != null) return false;
        if (inProgressList != null ? !inProgressList.equals(board.inProgressList) : board.inProgressList != null)
            return false;
        return doneList != null ? doneList.equals(board.doneList) : board.doneList == null;
    }

    @Override
    public int hashCode() {
        int result = toDoList != null ? toDoList.hashCode() : 0;
        result = 31 * result + (inProgressList != null ? inProgressList.hashCode() : 0);
        result = 31 * result + (doneList != null ? doneList.hashCode() : 0);
        return result;
    }
}
