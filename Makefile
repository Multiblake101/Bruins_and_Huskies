BIN=bin
CLIENT=GameClient # The name of the client class (sans .class)

all: $(BIN)
	javac *.java
	mv *.class $(BIN)

$(BIN):
	mkdir $(BIN)

run:
	java $(CLIENT)

clean:
	rm -rf $(BIN)
