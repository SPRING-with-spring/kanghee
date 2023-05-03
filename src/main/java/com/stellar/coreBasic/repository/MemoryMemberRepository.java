package com.stellar.coreBasic.repository;

import com.stellar.coreBasic.entity.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<String, Member> store = new ConcurrentHashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getName(), member);
    }

    @Override
    public Member findByName(String memberName) {
        return store.get(memberName);
    }
}
