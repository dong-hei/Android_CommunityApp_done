package com.dk.mylivealonelife.utils

import com.google.firebase.auth.FirebaseAuth

class FirebaseAuthUtil {

    companion object {

        private lateinit var auth : FirebaseAuth

        fun getUid() : String {

            auth = FirebaseAuth.getInstance()


            return auth.currentUser?.uid.toString()
        }

    }

}