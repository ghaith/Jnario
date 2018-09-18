package org.jnario.spec.tests.unit.compiler

describe "Test special bugs"{
    fact "Test error - TODO: import a functional handle on the type resolution that delegates to the best available" {
        #[1,2,3] => [
            it.forEach[println(it)]
        ]
    }
}
