# Observe MicroProfile

A little after-work experiment using Grafana-stuff and Microprofile-stuff to get insight into an app.

## What's the goal?

We would like to have an ultra-simplistic microprofile-based application that consists of a products, cart and a payment service (all
mocked, of course) and the cart service will call the payment service when we submit a check out. Let's gather data about failed payments,
how much money we made and the other general stuff (how much resources do we use, et cetera).

Visualization should happen through Grafana with the help of Prometheus and possibly Tempo for the OpenTracing-stuff.

## Good to know

We place deployment artifacts for OpenShift together with the service (Tekton, Kustomize, Argo is not needed for this toy project), a
template project is located in ./template so we only have to focus on code (not config) and getting Prometheus/Grafana/Tempo running.

## WoW

We split in two teams (both teams should consist of both disciplines) and get working. If we don't manage to finish in 2,5 hours we've
planned for we can be happy about the companionship we enjoyed! :D
