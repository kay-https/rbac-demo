# 🔐 RBAC com Spring Boot

Projeto criado no **Day 4/30 do desafio #30DaysOfJavaWithKay**.

A ideia é implementar um **controle de acesso por roles (RBAC)** do zero usando Spring Boot, sem Spring Security, para entender como a autorização funciona por baixo dos panos.

---

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🧠 O que foi implementado

- Cadastro de usuários com roles (ADMIN, USER)
- Enum de permissões
- Annotation custom `@RequiresRole`
- Interceptor para validar acesso
- Simulação de autenticação via Header
- Bloqueio automático com 401 e 403

---

## 🔐 Como funciona

O cliente envia no header:


O sistema busca o usuário no banco e valida se ele possui a role exigida pela rota.

---

## 🧪 Testes rápidos

### Rota pública


### USER


### ADMIN


---

## ✨ Objetivo

Treinar arquitetura backend, interceptors, annotations customizadas e conceitos reais de autorização antes de usar frameworks prontos como Spring Security.

---

## 🖤 Autora

Kayllanne Farias  
#30DaysOfJavaWithKay

