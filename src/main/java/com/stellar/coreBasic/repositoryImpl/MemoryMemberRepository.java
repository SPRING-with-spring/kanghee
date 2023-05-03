package com.stellar.coreBasic.repositoryImpl;

import com.stellar.coreBasic.entity.HighSchoolGrade;
import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.repository.MemberRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {
    private static Map<String, Member> store = new HashMap<>() {{
        put("a", new Member("a", 90.0, 3, 99.1, HighSchoolGrade.FRESHMAN));
        put("b", new Member("b", 20.0, 8, 49.5, HighSchoolGrade.FRESHMAN));
    }};

    @Override
    public void save(Member member) {
        store.put(member.getName(), member);
    }

    @Override
    public Member findByName(String memberName) {
        return store.get(memberName);
    }

    @Override
    public List<Member> getMemberList() {
        return new ArrayList<>(store.values());
    }
}
