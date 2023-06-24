package com.stellar.coreBasic.repositoryImpl;

import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.repository.RankingPolicy;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class ScoreRankingPolicy implements RankingPolicy {
    @Override
    public int ranking(Member member, List<Member> memberList) {
        Collections.sort(memberList, new ScoreComparator());
        return memberList.indexOf(member) + 1;
    }

    class ScoreComparator implements Comparator<Member> {
        @Override
        public int compare(Member mem1, Member mem2) {
            if (mem1.getScore() > mem2.getScore()) return 1;
            else if (mem1.getScore() < mem2.getScore()) return -1;
            return 0;
        }
    }
}
