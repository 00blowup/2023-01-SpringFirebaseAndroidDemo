package com.example.demo.service;

import com.example.demo.domain.Member;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class MemberService {

    private static final String COLLECTION_NAME = "members";

    public String saveMember (Member member) {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = dbFirestore.collection(COLLECTION_NAME).document(member.getId()).set(member);

        try {
            return collectionApiFuture.get().getUpdateTime().toString();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "memberService failed";
        } catch (ExecutionException e) {
            e.printStackTrace();
            return "memberService failed";
        }
    }
}
