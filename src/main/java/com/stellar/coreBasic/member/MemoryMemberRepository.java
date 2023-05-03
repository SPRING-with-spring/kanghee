package com.stellar.coreBasic.member;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository{
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
