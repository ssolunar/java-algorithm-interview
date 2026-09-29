# 자바 알고리즘 인터뷰 with 코틀린 — 학습 기록

《자바 알고리즘 인터뷰 with 코틀린》(박상길, 책만)을 **Java 중심**으로 공부하면서 남기는 학습용 저장소입니다.
원본 예제 코드(`src/`)는 손대지 않고, `notes/`에 개념 정리와 문제 풀이 회고를 쌓아갑니다.

| 항목 | 내용 |
| --- | --- |
| 원본 저장소 | [onlybooks/java-algorithm-interview](https://github.com/onlybooks/java-algorithm-interview) (fork) |
| 도서 정보 | [책만 도서 페이지](https://www.onlybook.co.kr/entry/java-algorithm-interview) |
| 학습 언어 | **Java** (코틀린 코드는 비교·참고용) |
| 문제 출처 | LeetCode · 프로그래머스 |
| 진도 관리 | 챕터 단위 ([진도표](#-진도) 참고) |

---

## 🎯 학습 목표

- 자료구조·알고리즘의 **동작 원리를 말로 설명할 수 있을 정도로** 이해한다
- 문제를 보고 **어떤 자료구조·기법을 쓸지 판단하는 감각**을 기른다
- 모든 풀이의 **시간·공간 복잡도를 근거와 함께** 설명한다
- 정리한 내용을 그대로 블로그 글로 옮길 수 있는 형태로 남긴다

---

## 📁 저장소 구조

```
java-algorithm-interview/
├── src/                    # 원본(책) 예제 코드 — 수정하지 않음
│   ├── ch02 ~ ch24/
│   └── datatype/           # ListNode, TreeNode 공용 자료형
├── test/                   # 원본 테스트 코드
├── assets/                 # 원본 이미지(표지, 마인드맵)
├── notes/                  # ⭐ 내 학습 노트
│   ├── README.md           # 노트 인덱스
│   ├── TEMPLATE.md         # 챕터 노트 템플릿
│   ├── ch01 ~ ch24/
│   │   ├── README.md       # 개념 정리 + 문제별 회고
│   │   └── solutions/      # 내가 직접 푼 Java 코드 (PN.java)
│   └── ...
└── README.md
```

노트 전체 목록은 [notes/README.md](notes/README.md)에 있습니다. 원본 코드와 내 코드를 섞지 않는 것이 핵심입니다. 나중에 `git fetch upstream`으로 원본을 갱신해도 충돌이 나지 않습니다.

---

## 🔁 학습 루틴

| 단계 | 하는 일 | 남기는 것 |
| :---: | --- | --- |
| 1 | 문제를 **먼저 직접 푼다** (20~30분 타임박스) | `notes/chXX/solutions/PN.java` |
| 2 | 시간 초과 시 힌트만 보고 재시도, 그래도 안 되면 책 풀이 확인 | 막힌 지점 메모 |
| 3 | 책 풀이(`src/chXX`)와 **내 풀이를 비교** | 접근 차이·복잡도 차이 |
| 4 | 챕터 노트에 개념/패턴/실수 정리 | `notes/chXX/README.md` |
| 5 | 3일 · 1주 · 1달 뒤 **재풀이**하고 진도표 갱신 | 상태 뱃지 업데이트 |

**진행 상태 표기**

`⬜ 예정` · `🔄 진행 중` · `✅ 완료` · `🔁 재복습 필요`

<details>
<summary><b>챕터 노트 템플릿 (notes/TEMPLATE.md)</b></summary>

```markdown
# NN장. 주제

> 학습일: YYYY-MM-DD | 상태: 🔄

## 1. 핵심 개념
- 자료구조/알고리즘의 정의와 동작 원리
- 시간·공간 복잡도

## 2. 자바 구현 포인트
- 어떤 클래스/API를 쓰는가 (ArrayList, Deque, PriorityQueue, ...)
- 자주 쓰는 관용구와 주의점

## 3. 문제 풀이
### PN. 문제 제목 (★)
- **접근**: 어떻게 생각했는가
- **복잡도**: 시간 O(?) / 공간 O(?)
- **내 풀이 vs 책 풀이**: 무엇이 달랐는가
- **막혔던 점**:

## 4. 헷갈렸던 것 / 다시 볼 것
- [ ] ...

## 5. 한 줄 요약
```

</details>

---

## ✍️ 커밋 컨벤션

| 형식 | 예시 |
| --- | --- |
| `chNN: <내용>` | `ch06: 문자열 조작 개념 및 투 포인터 정리` |
| `PN: <내용>` | `P8: 빗물 트래핑 스택 풀이 노트 추가` |
| `docs: <내용>` | `docs: README 진도표 갱신` |
| `refactor: <내용>` | `refactor: ch07 내 풀이 정리` |

## 🔄 원본 저장소 변경사항 반영

```bash
git fetch upstream
git merge upstream/main   # 또는 git rebase upstream/main
git push origin main
```

---

## 🗺️ 전체 개념 지도

책 전체를 한 장으로 정리한 마인드맵. 챕터를 시작할 때마다 지금 배우는 게 전체 어디에 위치하는지 확인합니다.

![마인드맵](assets/mindmap.png)

---

## 📊 진도

| 장 | 주제 | 문제 수 | 원본 코드 | 내 노트 | 상태 |
| --- | --- | :---: | --- | --- | :---: |
| 1장 | 코딩 인터뷰 & 코딩 테스트 | — | — | [`ch01`](notes/ch01/README.md) | ⬜ |
| 2장 | 자바, 세상에서 가장 유명한 언어 | — | [`src/ch02`](src/ch02) | [`ch02`](notes/ch02/README.md) | ⬜ |
| 3장 | 코틀린, 구글이 인정한 공식 언어 | — | [`src/ch03`](src/ch03) | [`ch03`](notes/ch03/README.md) | ⬜ |
| 4장 | 자료형 | — | [`src/ch04`](src/ch04) | [`ch04`](notes/ch04/README.md) | ✅ |
| 5장 | 빅오 | — | [`src/ch05`](src/ch05) | [`ch05`](notes/ch05/README.md) | ⬜ |
| 6장 | 문자열 조작 | 6 | [`src/ch06`](src/ch06) | [`ch06`](notes/ch06/README.md) | 🔄 |
| 7장 | 배열 | 6 | [`src/ch07`](src/ch07) | [`ch07`](notes/ch07/README.md) | ⬜ |
| 8장 | 연결 리스트 | 7 | [`src/ch08`](src/ch08) | [`ch08`](notes/ch08/README.md) | ⬜ |
| 9장 | 스택, 큐 | 6 | [`src/ch09`](src/ch09) | [`ch09`](notes/ch09/README.md) | ⬜ |
| 10장 | 데크, 우선순위 큐 | 4 | [`src/ch10`](src/ch10) | [`ch10`](notes/ch10/README.md) | ⬜ |
| 11장 | 해시 테이블 | 5 | [`src/ch11`](src/ch11) | [`ch11`](notes/ch11/README.md) | ⬜ |
| 12장 | 그래프 | 9 | [`src/ch12`](src/ch12) | [`ch12`](notes/ch12/README.md) | ⬜ |
| 13장 | 최단 경로 문제 | 3 | [`src/ch13`](src/ch13) | [`ch13`](notes/ch13/README.md) | ⬜ |
| 14장 | 트리 | 13 | [`src/ch14`](src/ch14) | [`ch14`](notes/ch14/README.md) | ⬜ |
| 15장 | 힙 | 2 | [`src/ch15`](src/ch15) | [`ch15`](notes/ch15/README.md) | ⬜ |
| 16장 | 트라이 | 2 | [`src/ch16`](src/ch16) | [`ch16`](notes/ch16/README.md) | ⬜ |
| 17장 | 정렬 | 6 | [`src/ch17`](src/ch17) | [`ch17`](notes/ch17/README.md) | ⬜ |
| 18장 | 이진 검색 | 6 | [`src/ch18`](src/ch18) | [`ch18`](notes/ch18/README.md) | ⬜ |
| 19장 | 비트 조작 | 5 | [`src/ch19`](src/ch19) | [`ch19`](notes/ch19/README.md) | ⬜ |
| 20장 | 슬라이딩 윈도우 | 3 | [`src/ch20`](src/ch20) | [`ch20`](notes/ch20/README.md) | ⬜ |
| 21장 | 그리디 알고리즘 | 5 | [`src/ch21`](src/ch21) | [`ch21`](notes/ch21/README.md) | ⬜ |
| 22장 | 분할 정복 | 2 | [`src/ch22`](src/ch22) | [`ch22`](notes/ch22/README.md) | ⬜ |
| 23장 | 다이나믹 프로그래밍 | 5 | [`src/ch23`](src/ch23) | [`ch23`](notes/ch23/README.md) | ⬜ |
| 부록 | 2022년 카카오 공채 만점 가이드 | 7 | [`src/ch24`](src/ch24) | [`ch24`](notes/ch24/README.md) | ⬜ |
| **합계** |  | **102** |  |  |  |

---

## 📝 문제 풀이 목록 (102문제)

원본 저장소의 문제 목록에 **내 노트** 열을 추가했습니다. 각 링크는 해당 문제의 회고 섹션으로 바로 이동합니다.

| 번호 | 제목 | 난이도 | 장 | 풀이 코드 | 내 노트 |
| --- | --- | ---- | - | --- | --- |
| 1 | [유효한 팰린드롬](https://leetcode.com/problems/valid-palindrome/) | ★ | 6장. 문자열 조작 | [P1_1.java](src/ch06/P1_1.java)<br>[P1_2.java](src/ch06/P1_2.java)<br>[P1_3.kt](src/ch06/P1_3.kt) | [노트](notes/ch06/README.md#p1-유효한-팰린드롬) |
| 2 | [문자열 뒤집기](https://leetcode.com/problems/reverse-string/) | ★ | 6장. 문자열 조작 | [P2_1.java](src/ch06/P2_1.java)<br>[P2_2.kt](src/ch06/P2_2.kt) | [노트](notes/ch06/README.md#p2-문자열-뒤집기) |
| 3 | [로그 파일 재정렬](https://leetcode.com/problems/reorder-data-in-log-files/) | ★ | 6장. 문자열 조작 | [P3_1.java](src/ch06/P3_1.java)<br>[P3_2.kt](src/ch06/P3_2.kt) | [노트](notes/ch06/README.md#p3-로그-파일-재정렬) |
| 4 | [가장 흔한 단어](https://leetcode.com/problems/most-common-word/) | ★ | 6장. 문자열 조작 | [P4_1.java](src/ch06/P4_1.java)<br>[P4_2.kt](src/ch06/P4_2.kt) | [노트](notes/ch06/README.md#p4-가장-흔한-단어) |
| 5 | [그룹 애너그램](https://leetcode.com/problems/group-anagrams/) | ★★ | 6장. 문자열 조작 | [P5_1.java](src/ch06/P5_1.java)<br>[P5_2.kt](src/ch06/P5_2.kt) | [노트](notes/ch06/README.md#p5-그룹-애너그램) |
| 6 | [가장 긴 팰린드롬 부분 문자열](https://leetcode.com/problems/longest-palindromic-substring/) | ★★ | 6장. 문자열 조작 | [P6_1.java](src/ch06/P6_1.java)<br>[P6_2.kt](src/ch06/P6_2.kt) | [노트](notes/ch06/README.md#p6-가장-긴-팰린드롬-부분-문자열) |
| 7 | [두 수의 합](https://leetcode.com/problems/two-sum/) | ★ | 7장. 배열 | [P7_1.java](src/ch07/P7_1.java)<br>[P7_2.java](src/ch07/P7_2.java)<br>[P7_3.java](src/ch07/P7_3.java)<br>[P7_4.java](src/ch07/P7_4.java)<br>[P7_5.kt](src/ch07/P7_5.kt) | [노트](notes/ch07/README.md#p7-두-수의-합) |
| 8 | [빗물 트래핑](https://leetcode.com/problems/trapping-rain-water/) | ★★★ | 7장. 배열 | [P8_1.java](src/ch07/P8_1.java)<br>[P8_2.java](src/ch07/P8_2.java)<br>[P8_3.kt](src/ch07/P8_3.kt) | [노트](notes/ch07/README.md#p8-빗물-트래핑) |
| 9 | [세 수의 합](https://leetcode.com/problems/3sum/) | ★★ | 7장. 배열 | [P9_1.java](src/ch07/P9_1.java)<br>[P9_2.java](src/ch07/P9_2.java)<br>[P9_3.kt](src/ch07/P9_3.kt) | [노트](notes/ch07/README.md#p9-세-수의-합) |
| 10 | [배열 파티션 I](https://leetcode.com/problems/array-partition/) | ★ | 7장. 배열 | [P10_1.java](src/ch07/P10_1.java)<br>[P10_2.java](src/ch07/P10_2.java)<br>[P10_3.kt](src/ch07/P10_3.kt) | [노트](notes/ch07/README.md#p10-배열-파티션-i) |
| 11 | [자신을 제외한 배열의 곱](https://leetcode.com/problems/product-of-array-except-self/) | ★★ | 7장. 배열 | [P11_1.java](src/ch07/P11_1.java)<br>[P11_2.kt](src/ch07/P11_2.kt) | [노트](notes/ch07/README.md#p11-자신을-제외한-배열의-곱) |
| 12 | [주식을 사고팔기 가장 좋은 시점](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ★ | 7장. 배열 | [P12_1.java](src/ch07/P12_1.java)<br>[P12_2.java](src/ch07/P12_2.java)<br>[P12_3.kt](src/ch07/P12_3.kt) | [노트](notes/ch07/README.md#p12-주식을-사고팔기-가장-좋은-시점) |
| 13 | [팰린드롬 연결 리스트](https://leetcode.com/problems/palindrome-linked-list/) | ★ | 8장. 연결 리스트 | [P13_1.java](src/ch08/P13_1.java)<br>[P13_2.java](src/ch08/P13_2.java)<br>[P13_3.java](src/ch08/P13_3.java)<br>[P13_4.kt](src/ch08/P13_4.kt) | [노트](notes/ch08/README.md#p13-팰린드롬-연결-리스트) |
| 14 | [두 정렬 리스트의 병합](https://leetcode.com/problems/merge-two-sorted-lists/) | ★ | 8장. 연결 리스트 | [P14_1.java](src/ch08/P14_1.java)<br>[P14_2.kt](src/ch08/P14_2.kt) | [노트](notes/ch08/README.md#p14-두-정렬-리스트의-병합) |
| 15 | [역순 연결 리스트](https://leetcode.com/problems/reverse-linked-list/) | ★ | 8장. 연결 리스트 | [P15_1.java](src/ch08/P15_1.java)<br>[P15_2.java](src/ch08/P15_2.java)<br>[P15_3.kt](src/ch08/P15_3.kt) | [노트](notes/ch08/README.md#p15-역순-연결-리스트) |
| 16 | [두 수의 덧셈](https://leetcode.com/problems/add-two-numbers/) | ★★ | 8장. 연결 리스트 | [P16_1.java](src/ch08/P16_1.java)<br>[P16_2.java](src/ch08/P16_2.java)<br>[P16_3.kt](src/ch08/P16_3.kt) | [노트](notes/ch08/README.md#p16-두-수의-덧셈) |
| 17 | [페어의 노드 스왑](https://leetcode.com/problems/swap-nodes-in-pairs/) | ★★ | 8장. 연결 리스트 | [P17_1.java](src/ch08/P17_1.java)<br>[P17_2.java](src/ch08/P17_2.java)<br>[P17_3.java](src/ch08/P17_3.java)<br>[P17_4.kt](src/ch08/P17_4.kt) | [노트](notes/ch08/README.md#p17-페어의-노드-스왑) |
| 18 | [홀짝 연결 리스트](https://leetcode.com/problems/odd-even-linked-list/) | ★★ | 8장. 연결 리스트 | [P18_1.java](src/ch08/P18_1.java)<br>[P18_2.kt](src/ch08/P18_2.kt) | [노트](notes/ch08/README.md#p18-홀짝-연결-리스트) |
| 19 | [역순 연결 리스트 II](https://leetcode.com/problems/reverse-linked-list-ii/) | ★★ | 8장. 연결 리스트 | [P19_1.java](src/ch08/P19_1.java)<br>[P19_2.kt](src/ch08/P19_2.kt) | [노트](notes/ch08/README.md#p19-역순-연결-리스트-ii) |
| 20 | [유효한 괄호](https://leetcode.com/problems/valid-parentheses/) | ★ | 9장. 스택, 큐 | [P20_1.java](src/ch09/P20_1.java)<br>[P20_2.kt](src/ch09/P20_2.kt) | [노트](notes/ch09/README.md#p20-유효한-괄호) |
| 21 | [중복 문자 제거](https://leetcode.com/problems/remove-duplicate-letters/) | ★★★ | 9장. 스택, 큐 | [P21_1.java](src/ch09/P21_1.java)<br>[P21_2.java](src/ch09/P21_2.java)<br>[P21_3.kt](src/ch09/P21_3.kt) | [노트](notes/ch09/README.md#p21-중복-문자-제거) |
| 22 | [일일 온도](https://leetcode.com/problems/daily-temperatures/) | ★★ | 9장. 스택, 큐 | [P22_1.java](src/ch09/P22_1.java)<br>[P22_2.kt](src/ch09/P22_2.kt) | [노트](notes/ch09/README.md#p22-일일-온도) |
| 23 | [큐를 이용한 스택 구현](https://leetcode.com/problems/implement-stack-using-queues/) | ★ | 9장. 스택, 큐 | [P23_1.java](src/ch09/P23_1.java)<br>[P23_2.kt](src/ch09/P23_2.kt) | [노트](notes/ch09/README.md#p23-큐를-이용한-스택-구현) |
| 24 | [스택을 이용한 큐 구현](https://leetcode.com/problems/implement-queue-using-stacks/) | ★ | 9장. 스택, 큐 | [P24_1.java](src/ch09/P24_1.java)<br>[P24_2.kt](src/ch09/P24_2.kt) | [노트](notes/ch09/README.md#p24-스택을-이용한-큐-구현) |
| 25 | [원형 큐 디자인](https://leetcode.com/problems/design-circular-queue/) | ★★ | 9장. 스택, 큐 | [P25_1.java](src/ch09/P25_1.java)<br>[P25_2.kt](src/ch09/P25_2.kt) | [노트](notes/ch09/README.md#p25-원형-큐-디자인) |
| 26 | [원형 데크 디자인](https://leetcode.com/problems/design-circular-deque/) | ★★ | 10장. 데크, 우선순위 큐 | [P26_1.java](src/ch10/P26_1.java)<br>[P26_2.kt](src/ch10/P26_2.kt) | [노트](notes/ch10/README.md#p26-원형-데크-디자인) |
| 27 | [k개 정렬 리스트 병합](https://leetcode.com/problems/merge-k-sorted-lists/) | ★ | 10장. 데크, 우선순위 큐 | [P27_1.java](src/ch10/P27_1.java)<br>[P27_2.kt](src/ch10/P27_2.kt) | [노트](notes/ch10/README.md#p27-k개-정렬-리스트-병합) |
| 28 | [원점에 가장 가까운 k개의 점](https://leetcode.com/problems/k-closest-points-to-origin/) | ★★ | 10장. 데크, 우선순위 큐 | [P28_1.java](src/ch10/P28_1.java)<br>[P28_2.java](src/ch10/P28_2.java)<br>[P28_3.kt](src/ch10/P28_3.kt) | [노트](notes/ch10/README.md#p28-원점에-가장-가까운-k개의-점) |
| 29 | [더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/42626) | ★ | 10장. 데크, 우선순위 큐 | [P29_1.java](src/ch10/P29_1.java) | [노트](notes/ch10/README.md#p29-더-맵게) |
| 30 | [해시맵 디자인](https://leetcode.com/problems/design-hashmap/) | ★ | 11장. 해시 테이블 | [P30_1.java](src/ch11/P30_1.java)<br>[P30_2.kt](src/ch11/P30_2.kt) | [노트](notes/ch11/README.md#p30-해시맵-디자인) |
| 31 | [보석과 돌](https://leetcode.com/problems/jewels-and-stones/) | ★ | 11장. 해시 테이블 | [P31_1.java](src/ch11/P31_1.java)<br>[P31_2.java](src/ch11/P31_2.java)<br>[P31_3.kt](src/ch11/P31_3.kt) | [노트](notes/ch11/README.md#p31-보석과-돌) |
| 32 | [중복 문자 없는 가장 긴 부분 문자열](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | ★★ | 11장. 해시 테이블 | [P32_1.java](src/ch11/P32_1.java)<br>[P32_2.kt](src/ch11/P32_2.kt) | [노트](notes/ch11/README.md#p32-중복-문자-없는-가장-긴-부분-문자열) |
| 33 | [상위 k 빈도 엘리먼트](https://leetcode.com/problems/top-k-frequent-elements/) | ★★ | 11장. 해시 테이블 | [P33_1.java](src/ch11/P33_1.java)<br>[P33_2.java](src/ch11/P33_2.java)<br>[P33_3.kt](src/ch11/P33_3.kt) | [노트](notes/ch11/README.md#p33-상위-k-빈도-엘리먼트) |
| 34 | [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576) | ★ | 11장. 해시 테이블 | [P34_1.java](src/ch11/P34_1.java)<br>[P34_2.kt](src/ch11/P34_2.kt) | [노트](notes/ch11/README.md#p34-완주하지-못한-선수) |
| 35 | [섬의 개수](https://leetcode.com/problems/number-of-islands/) | ★★ | 12장. 그래프 | [P35_1.java](src/ch12/P35_1.java)<br>[P35_2.kt](src/ch12/P35_2.kt) | [노트](notes/ch12/README.md#p35-섬의-개수) |
| 36 | [전화번호 문자 조합](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | ★★ | 12장. 그래프 | [P36_1.java](src/ch12/P36_1.java)<br>[P36_2.kt](src/ch12/P36_2.kt) | [노트](notes/ch12/README.md#p36-전화번호-문자-조합) |
| 37 | [순열](https://leetcode.com/problems/permutations/) | ★★ | 12장. 그래프 | [P37_1.java](src/ch12/P37_1.java)<br>[P37_2.kt](src/ch12/P37_2.kt) | [노트](notes/ch12/README.md#p37-순열) |
| 38 | [조합](https://leetcode.com/problems/combinations/) | ★★ | 12장. 그래프 | [P38_1.java](src/ch12/P38_1.java)<br>[P38_2.kt](src/ch12/P38_2.kt) | [노트](notes/ch12/README.md#p38-조합) |
| 39 | [조합의 합](https://leetcode.com/problems/combination-sum/) | ★★ | 12장. 그래프 | [P39_1.java](src/ch12/P39_1.java)<br>[P39_2.kt](src/ch12/P39_2.kt) | [노트](notes/ch12/README.md#p39-조합의-합) |
| 40 | [부분집합](https://leetcode.com/problems/subsets/) | ★★ | 12장. 그래프 | [P40_1.java](src/ch12/P40_1.java)<br>[P40_2.kt](src/ch12/P40_2.kt) | [노트](notes/ch12/README.md#p40-부분집합) |
| 41 | [일정 재구성](https://leetcode.com/problems/reconstruct-itinerary/) | ★★ | 12장. 그래프 | [P41_1.java](src/ch12/P41_1.java)<br>[P41_2.java](src/ch12/P41_2.java)<br>[P41_3.kt](src/ch12/P41_3.kt) | [노트](notes/ch12/README.md#p41-일정-재구성) |
| 42 | [여행 경로](https://school.programmers.co.kr/learn/courses/30/lessons/43164) | ★★ | 12장. 그래프 | [P42_1.java](src/ch12/P42_1.java)<br>[P42_2.kt](src/ch12/P42_2.kt) | [노트](notes/ch12/README.md#p42-여행-경로) |
| 43 | [코스 일정](https://leetcode.com/problems/course-schedule/) | ★★ | 12장. 그래프 | [P43_1.java](src/ch12/P43_1.java)<br>[P43_2.java](src/ch12/P43_2.java)<br>[P43_3.kt](src/ch12/P43_3.kt) | [노트](notes/ch12/README.md#p43-코스-일정) |
| 44 | [네트워크 딜레이 타임](https://leetcode.com/problems/network-delay-time/) | ★★ | 13장. 최단 경로 문제 | [P44_1.java](src/ch13/P44_1.java)<br>[P44_2.kt](src/ch13/P44_2.kt) | [노트](notes/ch13/README.md#p44-네트워크-딜레이-타임) |
| 45 | [k 경유지 내 가장 저렴한 항공권](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | ★★ | 13장. 최단 경로 문제 | [P45_1.java](src/ch13/P45_1.java)<br>[P45_2.java](src/ch13/P45_2.java)<br>[P45_3.kt](src/ch13/P45_3.kt) | [노트](notes/ch13/README.md#p45-k-경유지-내-가장-저렴한-항공권) |
| 46 | [게임 맵 최단 거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844) | ★★ | 13장. 최단 경로 문제 | [P46_1.java](src/ch13/P46_1.java) | [노트](notes/ch13/README.md#p46-게임-맵-최단-거리) |
| 47 | [이진 트리의 최대 깊이](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | ★ | 14장. 트리 | [P47_1.java](src/ch14/P47_1.java)<br>[P47_2.java](src/ch14/P47_2.java)<br>[P47_3.kt](src/ch14/P47_3.kt) | [노트](notes/ch14/README.md#p47-이진-트리의-최대-깊이) |
| 48 | [이진 트리의 직경](https://leetcode.com/problems/diameter-of-binary-tree/) | ★ | 14장. 트리 | [P48_1.java](src/ch14/P48_1.java)<br>[P48_2.kt](src/ch14/P48_2.kt) | [노트](notes/ch14/README.md#p48-이진-트리의-직경) |
| 49 | [가장 긴 동일 값의 경로](https://leetcode.com/problems/longest-univalue-path/) | ★ | 14장. 트리 | [P49_1.java](src/ch14/P49_1.java)<br>[P49_2.kt](src/ch14/P49_2.kt) | [노트](notes/ch14/README.md#p49-가장-긴-동일-값의-경로) |
| 50 | [이진 트리 반전](https://leetcode.com/problems/invert-binary-tree/) | ★ | 14장. 트리 | [P50_1.java](src/ch14/P50_1.java)<br>[P50_2.java](src/ch14/P50_2.java)<br>[P50_3.java](src/ch14/P50_3.java)<br>[P50_4.java](src/ch14/P50_4.java)<br>[P50_5.java](src/ch14/P50_5.java)<br>[P50_6.kt](src/ch14/P50_6.kt) | [노트](notes/ch14/README.md#p50-이진-트리-반전) |
| 51 | [두 이진 트리 병합](https://leetcode.com/problems/merge-two-binary-trees/) | ★ | 14장. 트리 | [P51_1.java](src/ch14/P51_1.java)<br>[P51_2.kt](src/ch14/P51_2.kt) | [노트](notes/ch14/README.md#p51-두-이진-트리-병합) |
| 52 | [이진 트리 직렬화 & 역직렬화](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | ★★★ | 14장. 트리 | [P52_1.java](src/ch14/P52_1.java)<br>[P52_2.kt](src/ch14/P52_2.kt) | [노트](notes/ch14/README.md#p52-이진-트리-직렬화--역직렬화) |
| 53 | [균형 이진 트리](https://leetcode.com/problems/balanced-binary-tree/) | ★ | 14장. 트리 | [P53_1.java](src/ch14/P53_1.java)<br>[P53_2.kt](src/ch14/P53_2.kt) | [노트](notes/ch14/README.md#p53-균형-이진-트리) |
| 54 | [최소 높이 트리](https://leetcode.com/problems/minimum-height-trees/) | ★★ | 14장. 트리 | [P54_1.java](src/ch14/P54_1.java)<br>[P54_2.kt](src/ch14/P54_2.kt) | [노트](notes/ch14/README.md#p54-최소-높이-트리) |
| 55 | [정렬된 배열의 이진 탐색 트리 변환](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | ★ | 14장. 트리 | [P55_1.java](src/ch14/P55_1.java)<br>[P55_2.kt](src/ch14/P55_2.kt) | [노트](notes/ch14/README.md#p55-정렬된-배열의-이진-탐색-트리-변환) |
| 56 | [이진 탐색 트리(BST)를 더 큰 수 합계 트리로](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/) | ★★ | 14장. 트리 | [P56_1.java](src/ch14/P56_1.java)<br>[P56_2.kt](src/ch14/P56_2.kt) | [노트](notes/ch14/README.md#p56-이진-탐색-트리bst를-더-큰-수-합계-트리로) |
| 57 | [이진 탐색 트리(BST) 합의 범위](https://leetcode.com/problems/range-sum-of-bst/) | ★ | 14장. 트리 | [P57_1.java](src/ch14/P57_1.java)<br>[P57_2.java](src/ch14/P57_2.java)<br>[P57_3.java](src/ch14/P57_3.java)<br>[P57_4.java](src/ch14/P57_4.java)<br>[P57_5.kt](src/ch14/P57_5.kt) | [노트](notes/ch14/README.md#p57-이진-탐색-트리bst-합의-범위) |
| 58 | [이진 탐색 트리(BST) 노드 간 최솟값](https://leetcode.com/problems/minimum-distance-between-bst-nodes/) | ★ | 14장. 트리 | [P58_1.java](src/ch14/P58_1.java)<br>[P58_2.java](src/ch14/P58_2.java)<br>[P58_3.kt](src/ch14/P58_3.kt) | [노트](notes/ch14/README.md#p58-이진-탐색-트리bst-노드-간-최솟값) |
| 59 | [전위, 중위 순회 결과로 이진 트리 구축](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | ★★ | 14장. 트리 | [P59_1.java](src/ch14/P59_1.java)<br>[P59_2.java](src/ch14/P59_2.java)<br>[P59_3.kt](src/ch14/P59_3.kt) | [노트](notes/ch14/README.md#p59-전위-중위-순회-결과로-이진-트리-구축) |
| 60 | [배열의 k번째 큰 엘리먼트](https://leetcode.com/problems/kth-largest-element-in-an-array/) | ★★ | 15장. 힙 | [P60_1.java](src/ch15/P60_1.java)<br>[P60_2.java](src/ch15/P60_2.java)<br>[P60_3.kt](src/ch15/P60_3.kt) | [노트](notes/ch15/README.md#p60-배열의-k번째-큰-엘리먼트) |
| 61 | [이중 우선순위 큐](https://school.programmers.co.kr/learn/courses/30/lessons/42628) | ★★★ | 15장. 힙 | [P61_1.java](src/ch15/P61_1.java)<br>[P61_2.java (예정)](src/ch15/P61_2.java)<br>[P61_3.kt](src/ch15/P61_3.kt) | [노트](notes/ch15/README.md#p61-이중-우선순위-큐) |
| 62 | [트라이 구현](https://leetcode.com/problems/implement-trie-prefix-tree/) | ★★ | 16장. 트라이 | [P62_1.java](src/ch16/P62_1.java)<br>[P62_2.kt](src/ch16/P62_2.kt) | [노트](notes/ch16/README.md#p62-트라이-구현) |
| 63 | [팰린드롬 페어](https://leetcode.com/problems/palindrome-pairs/) | ★★★ | 16장. 트라이 | [P63_1.java](src/ch16/P63_1.java)<br>[P63_2.java](src/ch16/P63_2.java)<br>[P63_3.kt](src/ch16/P63_3.kt) | [노트](notes/ch16/README.md#p63-팰린드롬-페어) |
| 64 | [리스트 정렬](https://leetcode.com/problems/sort-list/) | ★★ | 17장. 정렬 | [P64_1.java](src/ch17/P64_1.java)<br>[P64_2.java](src/ch17/P64_2.java)<br>[P64_3.kt](src/ch17/P64_3.kt) | [노트](notes/ch17/README.md#p64-리스트-정렬) |
| 65 | [구간 병합](https://leetcode.com/problems/merge-intervals/) | ★★ | 17장. 정렬 | [P65_1.java](src/ch17/P65_1.java)<br>[P65_2.kt](src/ch17/P65_2.kt) | [노트](notes/ch17/README.md#p65-구간-병합) |
| 66 | [삽입 정렬 리스트](https://leetcode.com/problems/insertion-sort-list/) | ★★ | 17장. 정렬 | [P66_1.java](src/ch17/P66_1.java)<br>[P66_2.java](src/ch17/P66_2.java)<br>[P66_3.kt](src/ch17/P66_3.kt) | [노트](notes/ch17/README.md#p66-삽입-정렬-리스트) |
| 67 | [가장 큰 수](https://leetcode.com/problems/largest-number/) | ★★ | 17장. 정렬 | [P67_1.java](src/ch17/P67_1.java)<br>[P67_2.kt](src/ch17/P67_2.kt) | [노트](notes/ch17/README.md#p67-가장-큰-수) |
| 68 | [유효한 애너그램](https://leetcode.com/problems/valid-anagram/) | ★ | 17장. 정렬 | [P68_1.java](src/ch17/P68_1.java)<br>[P68_2.kt](src/ch17/P68_2.kt)<br>[P68_3.kt](src/ch17/P68_3.kt) | [노트](notes/ch17/README.md#p68-유효한-애너그램) |
| 69 | [색 정렬](https://leetcode.com/problems/sort-colors/) | ★★ | 17장. 정렬 | [P69_1.java](src/ch17/P69_1.java)<br>[P69_2.kt](src/ch17/P69_2.kt) | [노트](notes/ch17/README.md#p69-색-정렬) |
| 70 | [이진 검색](https://leetcode.com/problems/binary-search/) | ★ | 18장. 이진 검색 | [P70_1.java](src/ch18/P70_1.java)<br>[P70_2.java](src/ch18/P70_2.java)<br>[P70_3.java](src/ch18/P70_3.java)<br>[P70_4.java](src/ch18/P70_4.java)<br>[P70_5.kt](src/ch18/P70_5.kt) | [노트](notes/ch18/README.md#p70-이진-검색) |
| 71 | [회전 정렬된 배열 검색](https://leetcode.com/problems/search-in-rotated-sorted-array/) | ★★ | 18장. 이진 검색 | [P71_1.java](src/ch18/P71_1.java)<br>[P71_2.kt](src/ch18/P71_2.kt) | [노트](notes/ch18/README.md#p71-회전-정렬된-배열-검색) |
| 72 | [두 배열의 교집합](https://leetcode.com/problems/intersection-of-two-arrays/) | ★ | 18장. 이진 검색 | [P72_1.java](src/ch18/P72_1.java)<br>[P72_2.java](src/ch18/P72_2.java)<br>[P72_3.java](src/ch18/P72_3.java)<br>[P72_4.kt](src/ch18/P72_4.kt) | [노트](notes/ch18/README.md#p72-두-배열의-교집합) |
| 73 | [두 수의 합 II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | ★ | 18장. 이진 검색 | [P73_1.java](src/ch18/P73_1.java)<br>[P73_2.java](src/ch18/P73_2.java)<br>[P73_3.java](src/ch18/P73_3.java)<br>[P73_4.kt](src/ch18/P73_4.kt) | [노트](notes/ch18/README.md#p73-두-수의-합-ii) |
| 74 | [2D 행렬 검색 II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | ★★ | 18장. 이진 검색 | [P74_1.java](src/ch18/P74_1.java)<br>[P74_2.kt](src/ch18/P74_2.kt) | [노트](notes/ch18/README.md#p74-2d-행렬-검색-ii) |
| 75 | [입국심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238) | ★★★ | 18장. 이진 검색 | [P75_1.java](src/ch18/P75_1.java)<br>[P75_2.kt](src/ch18/P75_2.kt) | [노트](notes/ch18/README.md#p75-입국심사) |
| 76 | [싱글 넘버](https://leetcode.com/problems/single-number/) | ★ | 19장. 비트 조작 | [P76_1.java](src/ch19/P76_1.java)<br>[P76_2.kt](src/ch19/P76_2.kt) | [노트](notes/ch19/README.md#p76-싱글-넘버) |
| 77 | [해밍 거리](https://leetcode.com/problems/hamming-distance/) | ★ | 19장. 비트 조작 | [P77_1.java](src/ch19/P77_1.java)<br>[P77_2.kt](src/ch19/P77_2.kt) | [노트](notes/ch19/README.md#p77-해밍-거리) |
| 78 | [두 정수의 합](https://leetcode.com/problems/sum-of-two-integers/) | ★★★ | 19장. 비트 조작 | [P78_1.java](src/ch19/P78_1.java)<br>[P78_2.java](src/ch19/P78_2.java)<br>[P78_3.kt](src/ch19/P78_3.kt) | [노트](notes/ch19/README.md#p78-두-정수의-합) |
| 79 | [UTF-8 검증](https://leetcode.com/problems/utf-8-validation/) | ★★ | 19장. 비트 조작 | [P79_1.java](src/ch19/P79_1.java)<br>[P79_2.kt](src/ch19/P79_2.kt) | [노트](notes/ch19/README.md#p79-utf-8-검증) |
| 80 | [1비트의 개수](https://leetcode.com/problems/number-of-1-bits/) | ★ | 19장. 비트 조작 | [P80_1.java](src/ch19/P80_1.java)<br>[P80_2.java](src/ch19/P80_2.java)<br>[P80_3.kt](src/ch19/P80_3.kt) | [노트](notes/ch19/README.md#p80-1비트의-개수) |
| 81 | [최대 슬라이딩 윈도우](https://leetcode.com/problems/sliding-window-maximum/) | ★★★ | 20장. 슬라이딩 윈도우 | [P81_1.java](src/ch20/P81_1.java)<br>[P81_2.java](src/ch20/P81_2.java)<br>[P81_3.java](src/ch20/P81_3.java)<br>[P81_4.kt](src/ch20/P81_4.kt) | [노트](notes/ch20/README.md#p81-최대-슬라이딩-윈도우) |
| 82 | [부분 문자열이 포함된 최소 윈도우](https://leetcode.com/problems/minimum-window-substring/) | ★★★ | 20장. 슬라이딩 윈도우 | [P82_1.java](src/ch20/P82_1.java)<br>[P82_2.java](src/ch20/P82_2.java)<br>[P82_3.kt](src/ch20/P82_3.kt) | [노트](notes/ch20/README.md#p82-부분-문자열이-포함된-최소-윈도우) |
| 83 | [가장 긴 반복 문자 대체](https://leetcode.com/problems/longest-repeating-character-replacement/) | ★★ | 20장. 슬라이딩 윈도우 | [P83_1.java](src/ch20/P83_1.java)<br>[P83_2.kt](src/ch20/P83_2.kt) | [노트](notes/ch20/README.md#p83-가장-긴-반복-문자-대체) |
| 84 | [주식을 사고팔기 가장 좋은 시점 II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | ★ | 21장. 그리디 알고리즘 | [P84_1.java](src/ch21/P84_1.java)<br>[P84_2.kt](src/ch21/P84_2.kt) | [노트](notes/ch21/README.md#p84-주식을-사고팔기-가장-좋은-시점-ii) |
| 85 | [키에 따른 대기열 재구성](https://leetcode.com/problems/queue-reconstruction-by-height/) | ★★ | 21장. 그리디 알고리즘 | [P85_1.java](src/ch21/P85_1.java)<br>[P85_2.kt](src/ch21/P85_2.kt) | [노트](notes/ch21/README.md#p85-키에-따른-대기열-재구성) |
| 86 | [태스크 스케줄러](https://leetcode.com/problems/task-scheduler/) | ★★ | 21장. 그리디 알고리즘 | [P86_1.java](src/ch21/P86_1.java)<br>[P86_2.kt](src/ch21/P86_2.kt) | [노트](notes/ch21/README.md#p86-태스크-스케줄러) |
| 87 | [주유소](https://leetcode.com/problems/gas-station/) | ★★ | 21장. 그리디 알고리즘 | [P87_1.java](src/ch21/P87_1.java)<br>[P87_2.java](src/ch21/P87_2.java)<br>[P87_3.kt](src/ch21/P87_3.kt) | [노트](notes/ch21/README.md#p87-주유소) |
| 88 | [쿠키 부여](https://leetcode.com/problems/assign-cookies/) | ★ | 21장. 그리디 알고리즘 | [P88_1.java](src/ch21/P88_1.java)<br>[P88_2.kt](src/ch21/P88_2.kt) | [노트](notes/ch21/README.md#p88-쿠키-부여) |
| 89 | [과반수 엘리먼트](https://leetcode.com/problems/majority-element/) | ★ | 22장. 분할 정복 | [P89_1.java](src/ch22/P89_1.java)<br>[P89_2.java](src/ch22/P89_2.java)<br>[P89_3.java](src/ch22/P89_3.java)<br>[P89_4.kt](src/ch22/P89_4.kt) | [노트](notes/ch22/README.md#p89-과반수-엘리먼트) |
| 90 | [괄호를 삽입하는 여러가지 방법](https://leetcode.com/problems/different-ways-to-add-parentheses/) | ★★ | 22장. 분할 정복 | [P90_1.java](src/ch22/P90_1.java)<br>[P90_2.java](src/ch22/P90_2.java)<br>[P90_3.kt](src/ch22/P90_3.kt) | [노트](notes/ch22/README.md#p90-괄호를-삽입하는-여러가지-방법) |
| 91 | [피보나치 수](https://leetcode.com/problems/fibonacci-number/) | ★ | 23장. 다이나믹 프로그래밍 | [P91_1.java](src/ch23/P91_1.java)<br>[P91_2.java](src/ch23/P91_2.java)<br>[P91_3.java](src/ch23/P91_3.java)<br>[P91_4.java](src/ch23/P91_4.java)<br>[P91_5.kt](src/ch23/P91_5.kt) | [노트](notes/ch23/README.md#p91-피보나치-수) |
| 92 | [최대 서브 배열](https://leetcode.com/problems/maximum-subarray/) | ★ | 23장. 다이나믹 프로그래밍 | [P92_1.java](src/ch23/P92_1.java)<br>[P92_2.java](src/ch23/P92_2.java)<br>[P92_3.java](src/ch23/P92_3.java)<br>[P92_4.kt](src/ch23/P92_4.kt) | [노트](notes/ch23/README.md#p92-최대-서브-배열) |
| 93 | [계단 오르기](https://leetcode.com/problems/climbing-stairs/) | ★ | 23장. 다이나믹 프로그래밍 | [P93_1.java](src/ch23/P93_1.java)<br>[P93_2.java](src/ch23/P93_2.java)<br>[P93_3.kt](src/ch23/P93_3.kt) | [노트](notes/ch23/README.md#p93-계단-오르기) |
| 94 | [집 도둑](https://leetcode.com/problems/house-robber/) | ★ | 23장. 다이나믹 프로그래밍 | [P94_1.java](src/ch23/P94_1.java)<br>[P94_2.java](src/ch23/P94_2.java)<br>[P94_3.kt](src/ch23/P94_3.kt) | [노트](notes/ch23/README.md#p94-집-도둑) |
| 95 | [도둑질](https://school.programmers.co.kr/learn/courses/30/lessons/42897) | ★★★ | 23장. 다이나믹 프로그래밍 | [P95_1.java](src/ch23/P95_1.java) | [노트](notes/ch23/README.md#p95-도둑질) |
| 96(문제 1) | [신고 결과 받기](https://school.programmers.co.kr/learn/courses/30/lessons/92334) | ★ | 부록. 2022년 카카오 공채 만점 가이드 | [P96_1.java](src/ch24/P96_1.java)<br>[P96_2.kt](src/ch24/P96_2.kt) | [노트](notes/ch24/README.md#p96-신고-결과-받기) |
| 97(문제 2) | [k진수에서 소수 개수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/92335) | ★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P97_1.java](src/ch24/P97_1.java)<br>[P97_2.java](src/ch24/P97_2.java)<br>[P97_3.java](src/ch24/P97_3.java)<br>[P97_4.java](src/ch24/P97_4.java)<br>[P97_5.kt](src/ch24/P97_5.kt) | [노트](notes/ch24/README.md#p97-k진수에서-소수-개수-구하기) |
| 98(문제 3) | [주차 요금 계산](https://school.programmers.co.kr/learn/courses/30/lessons/92341) | ★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P98_1.java](src/ch24/P98_1.java)<br>[P98_2.kt](src/ch24/P98_2.kt) | [노트](notes/ch24/README.md#p98-주차-요금-계산) |
| 99(문제 4) | [양궁대회](https://school.programmers.co.kr/learn/courses/30/lessons/92342) | ★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P99_1.java](src/ch24/P99_1.java)<br>[P99_2.kt](src/ch24/P99_2.kt) | [노트](notes/ch24/README.md#p99-양궁대회) |
| 100(문제 5) | [양과 늑대](https://school.programmers.co.kr/learn/courses/30/lessons/92343) | ★★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P100_1.java](src/ch24/P100_1.java)<br>[P100_2.kt](src/ch24/P100_2.kt) | [노트](notes/ch24/README.md#p100-양과-늑대) |
| 101(문제 6) | [파괴되지 않은 건물](https://school.programmers.co.kr/learn/courses/30/lessons/92344) | ★★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P101_2.java](src/ch24/P101_2.java)<br>[P101_3.kt](src/ch24/P101_3.kt) | [노트](notes/ch24/README.md#p101-파괴되지-않은-건물) |
| 102(문제 7) | [사라지는 발판](https://school.programmers.co.kr/learn/courses/30/lessons/92345) | ★★★ | 부록. 2022년 카카오 공채 만점 가이드 | [P102_1.java](src/ch24/P102_1.java)<br>[P102_2.kt](src/ch24/P102_2.kt) | [노트](notes/ch24/README.md#p102-사라지는-발판) |

---

## 🧩 기타 예제 코드

책 본문에서 개념 설명에 쓰인 예제 코드 목록입니다.

- 2장
  - [제네릭 예제](src/ch02/GenericExample.java)
  - [람다 표현식 예제](src/ch02/LambdaExpressionExample.java)
  - [람다 표현식 정렬 예제](src/ch02/LambdaExpressionSortExample.java)
  - [스트림 API 예제](src/ch02/SteamAPIExample.java)
- 3장
  - [자바 조건문 예제](src/ch03/JavaConditionExample.java)
  - [코틀린 조건문 예제](src/ch03/KotlinConditionExample.kt)
  - [코틀린 함수형 예제](src/ch03/KotlinFunctionalExample.kt)
  - [코틀린 컴파일 예제](src/ch03/Array.kt)
- 4장
  - [자바 참조 자료형 예제](src/ch04/JavaDataType.java)
  - [자바 원시 자료형과 참조 자료형의 속도 비교](src/ch04/JavaPerf.java)
  - [맵 예제](src/ch04/MapExample.java)
  - [코틀린 자료형 속도 측정](src/ch04/KotlinPerf.kt)
  - [코틀린 자료형의 제공 기능](src/ch04/KotlinDataType.kt)
  - [자바 컬렉션 프레임워크 속도 측정 1](src/ch04/CollectionsFrameworkPerf1.java)
  - [자바 컬렉션 프레임워크 속도 측정 2](src/ch04/CollectionsFrameworkPerf2.java)
- 5장
  - [빅오 예제](src/ch05/BigOExample.java)
  - [자바 컬렉션 프레임워크 속도 측정](src/ch05/CollectionsFrameworkPerf.java)
- 6장
  - [값에 의한 호출 예제](src/ch06/CallByValueExample.java)
- 7장
  - [엘비스 연산자 예제](src/ch07/ElvisExample.kt)
- 9장
  - [스택 구현 예제](src/ch09/StackExample.java)
  - [오토박싱 속도 측정](src/ch09/AutoBoxingPerf.java)
- 10장
  - [자바 중첩 클래스 예제](src/ch10/JavaNestedClassExample.java)
  - [코틀린 중첩 클래스 예제](src/ch10/KotlinNestedClassExample.kt)
  - [자바 클래스 생성자 예제](src/ch10/JavaCarExample.java)
  - [코틀린 클래스 생성자 예제](src/ch10/KotlinCarExample.kt)
- 11장
  - [생일 문제 예제](src/ch11/BirthdayProblemExample.java)
- 12장
  - [그래프 순회 예제](src/ch12/GraphTraversalsExample.java)
- 14장
  - [트리 순회 예제](src/ch14/TreeTraversalsExample.java)
- 15장
  - [이진 힙 구현 예제](src/ch15/BinaryHeapExample.java)
- 17장
  - [버블 정렬 예제](src/ch17/BubbleSortExample.java)
  - [삽입 정렬 예제](src/ch17/InsertionSortExample.java)
  - [퀵 정렬 예제](src/ch17/QuickSortExample.java)
- 21장
  - [분할 가능 배낭 문제 예제](src/ch21/FractionalKnapsackExample.java)
- 23장
  - [피보나치 수열 상향식 예제](src/ch23/FibonacciBottomUpExample.java)
  - [피보나치 수열 하향식 예제](src/ch23/FibonacciTopDownExample.java)
  - [0-1 배낭 문제 예제](src/ch23/ZeroOneKnapsackExample.java)

---

## 📚 원본 저장소 안내

이 저장소는 [onlybooks/java-algorithm-interview](https://github.com/onlybooks/java-algorithm-interview)의 포크입니다.
`src/`, `test/`, `assets/`의 예제 코드와 이미지의 저작권은 원저자(박상길)와 출판사(책만)에 있으며, 학습 목적으로만 사용합니다.
`notes/` 이하의 정리 내용은 제가 직접 작성한 것입니다.

- 도서 구매: [교보문고](https://product.kyobobook.co.kr/detail/S000209071463) · [YES24](https://www.yes24.com/Product/Goods/122445610) · [알라딘](http://aladin.kr/p/F4rm0)
- 파이썬 버전: [onlybooks/python-algorithm-interview](https://github.com/onlybooks/python-algorithm-interview)

