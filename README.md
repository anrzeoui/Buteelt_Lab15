# lab15-starter

F.CSM311 — Lab15-ийн starter код. Maven + JUnit5 жижиг проект.

## Build & test

```bash
mvn -B clean verify
```

## Бүтэц

```
src/
├── main/java/lab/
│   ├── Calculator.java      — нэмэх, хасах, үржих, хуваах
│   └── StringUtils.java     — capitalize, isBlank (reverse-г Даалгавар 2-т нэмнэ)
└── test/java/lab/
    └── CalculatorTest.java
```

## Lab15 даалгаврын товч жагсаалт

1. CI workflow бичих (`.github/workflows/ci.yml`)
2. `StringUtils.reverse()` нэмэх + тест + PR
3. Matrix build (Java 17 + 21)
4. Branch protection rule (main)
5. JaCoCo coverage gate (≥ 70%)
6. Peer review (хосоор)

Дэлгэрэнгүйг `Lab15-Git-Workflow-and-CICD.md` файлд харна уу.
