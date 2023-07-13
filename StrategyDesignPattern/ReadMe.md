<h1>Strategy Design Pattern</h1>

This design pattern is mainly used when we want to associate trigger events with event
for instance:-
<br>
<li> we want a list of similar kind of operation to be done when clicking a button
<li> <li> <li> <li> ...other examples from internet

<br>
<br>

Steps to implement observer design pattern
<li> use an <b>Event publisher</b> class to channelize the event received form <b>Client Class</b>
<li> use triggers represented by <b>Trigger Class</b> class which implements an <b>ApplicationTrigger</b> interface, <br>
ApplicationTrigger interface has the common method, here, <b>triggerEvent</b> which would be mandatory<br>
to be implemented in the child classes.
<li> in the ApplicationEventPublisher class, we use methods <b>registerEvent(some method parameters)</b> and 
<b>unregisterEvents(some method parameters)</b> to register and unregister the trigger events present in a globally <br> 
declared list, here: <b>List< ApplicationTrigger > triggers</b>
<li>lastly, upon EventTrigger, <b>onEventTrigger</b> will be called which would be calling the registered events

<br>
<br>
We can use different list to register and unregister events for different Triggers, eg.: triggering seperate events <br>
for prime and non prime members in amazon




