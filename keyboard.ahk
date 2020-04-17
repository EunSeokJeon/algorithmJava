*CapsLock:: sgn := 1
*CapsLock up:: sgn := 0
#if sgn
j::Key("left")
k::Key("down")
i::Key("up")
l::Key("right")
#if
Key(key)
{
SendInput {blind}{%key%}
}
Key_repeat(pfx, key)
{
SendInput {blind}%pfx%{%key%}
}
 
Ctrl::
GetKeyState, cstate, capslock, T
if cstate = U
SetCapslockState, On
if cstate = D
SetCapslockState, Off
return