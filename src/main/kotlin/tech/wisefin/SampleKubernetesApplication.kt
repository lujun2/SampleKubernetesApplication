package tech.wisefin

import io.dekorate.kubernetes.annotation.KubernetesApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@KubernetesApplication
@SpringBootApplication
class SampleKubernetesApplication

fun main(args: Array<String>) {
	runApplication<SampleKubernetesApplication>(*args)
}
