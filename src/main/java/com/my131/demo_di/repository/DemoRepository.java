package com.my131.demo_di.repository;

import org.springframework.stereotype.Repository;
//데이터 베이스 관련 처리는 repository
@Repository
public class DemoRepository {
    public void save(){
        System.out.println("저장 로직 실행");
    }
}
