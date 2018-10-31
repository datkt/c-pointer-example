c-pointer-example
=================

A simple example demonstrating the use of C pointers in Kotlin/Native.

## Background

The files needed to build this example can be built by running the
`make` (or `make build`) command. This will build the `pointer.klib` and
`main.kexe` files by using the `cinterop` command on `pointer.def` to generate
the Kotlin source, compiled binary, and the resulting `klib` file from
`pointer.h`. The `konanc` command then compiles the `main.kt` file that
links `pointer.klib` to a Kotlin executable `main.kexe`. The program is
then executable by invoking `./main.kexe`. This should print the
following output.

```
(int) 1234
(string) hello
```

## Building

To build the entire program, run `make build` which results in a
`main.kexe` program executable. The `Makefile` targets for various files
are documented below.

### `make build`

Builds everything.

### `make pointer.klib`

Builds the Kotlin library `pointer.klib` that can be linked in the
`konanc` command.

### `make main.kexe`

Builds the Kotlin program executable `main.kexe`. Depends on
`main pointer.klib`.

## See Also

* https://github.com/JetBrains/kotlin-native
* https://kotlinlang.org/docs/reference/native-overview.html
* https://rosettacode.org/wiki/Pointers_and_references#Kotlin
* https://kotlinlang.org/api/latest/jvm/stdlib/kotlinx.cinterop/index.html
* https://kotlinlang.org/api/latest/jvm/stdlib/kotlinx.cinterop/mem-scoped.html

## License

MIT
