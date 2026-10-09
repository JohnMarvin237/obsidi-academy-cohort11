package com.bptn.course.four_in_a_row_game;

public class ColumnFullException extends ArrayIndexOutOfBoundsException {
	public ColumnFullException(String errMessage) {
        super(errMessage);
    }
}
