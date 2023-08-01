package com.boot.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.BoardCommVO;
import com.boot.dto.BoardSellVO;

@Mapper
public interface BoardDAO{
	public void insertBoard(HashMap<String, String> param);
	public ArrayList<BoardSellVO> selectBoard();
	public BoardSellVO selectBoardContent(int board_key);
	public void insertBoardComm(HashMap<String, String> param);
	public ArrayList<BoardCommVO> selectBoardComm();
	public BoardCommVO selectBoardCommContent(int comm_key);
}










